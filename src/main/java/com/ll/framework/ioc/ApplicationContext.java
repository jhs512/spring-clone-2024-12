package com.ll.framework.ioc;

import com.ll.domain.post.post.service.PostService.PostService;

public class ApplicationContext {
    public ApplicationContext(String basePackage) {
    }

    public void init() {
    }

    public <T> T getBean(String beanName) {
        return (T) new PostService();
    }
}
