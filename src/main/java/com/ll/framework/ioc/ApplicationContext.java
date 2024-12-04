package com.ll.framework.ioc;

import com.ll.domain.post.post.repository.PostRepository;
import com.ll.domain.post.post.service.PostService.PostService;

public class ApplicationContext {
    public ApplicationContext(String basePackage) {
    }

    public void init() {
    }

    public <T> T getBean(String beanName) {
        if ("postRepository".equals(beanName)) {
            return (T) new PostRepository();
        }

        return (T) new PostService();
    }
}
