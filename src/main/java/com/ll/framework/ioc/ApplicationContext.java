package com.ll.framework.ioc;

import com.ll.domain.post.post.repository.PostRepository;
import com.ll.domain.post.post.service.PostService.PostService;
import com.ll.framework.ioc.annotations.Component;
import org.reflections.Reflections;
import org.reflections.scanners.Scanners;

import java.util.Set;
import java.util.stream.Collectors;

public class ApplicationContext {
    private String basePackage;
    private Reflections reflections;

    public ApplicationContext(String basePackage) {
        this.basePackage = basePackage;
    }

    public void init() {
        this.reflections = new Reflections(basePackage, Scanners.TypesAnnotated);
    }

    public <T> T getBean(String beanName) {
        if ("postRepository".equals(beanName)) {
            return (T) new PostRepository();
        }

        return (T) new PostService();
    }

    public Set<Class<?>> findComponentClasses() {
        return reflections
                .getTypesAnnotatedWith(Component.class)
                .stream()
                .filter(clazz -> !clazz.isInterface())
                .collect(Collectors.toSet());
    }
}
