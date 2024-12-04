package com.ll.framework.ioc;

import com.ll.domain.post.post.repository.PostRepository;
import com.ll.domain.post.post.service.PostService.PostService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

public class ApplicationContextTest {
    private ApplicationContext applicationContext;

    @BeforeEach
    public void beforeEach() {
        applicationContext = new ApplicationContext("com.ll");
        applicationContext.init();
    }

    @Test
    @DisplayName("ApplicationContext init")
    public void t1() {
        assertThat(applicationContext).isNotNull();
    }

    @Test
    @DisplayName("postService")
    public void t2() {
        PostService postService = applicationContext.getBean("postService");

        assertThat(postService).isNotNull();
    }

    @Test
    @DisplayName("postRepository")
    public void t3() {
        PostRepository postRepository = applicationContext.getBean("postRepository");

        assertThat(postRepository).isNotNull();
    }

    @Test
    @DisplayName("findComponentClasses")
    public void t4() {
        Set<Class<?>> componentClasses = applicationContext.findComponentClasses();

        assertThat(componentClasses).isNotEmpty();
        assertThat(componentClasses).contains(PostService.class);
        assertThat(componentClasses).contains(PostRepository.class);
    }

    @Test
    @DisplayName("initBeanDefinitions")
    public void t5() {
        applicationContext.initBeanDefinitions();

        Map<String, BeanDefinition> beanDefinitions = applicationContext.getBeanDefinitions();

        assertThat(beanDefinitions).isNotEmpty();
    }
}
