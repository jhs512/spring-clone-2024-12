package com.ll.framework.ioc;

import com.ll.domain.post.post.service.PostService.PostService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ApplicationContextTest {
    @Test
    @DisplayName("ApplicationContext init")
    public void t1() {
        ApplicationContext applicationContext = new ApplicationContext("com.ll");
        applicationContext.init();
    }

    @Test
    @DisplayName("postService")
    public void t2() {
        ApplicationContext applicationContext = new ApplicationContext("com.ll");
        applicationContext.init();

        PostService postService = applicationContext.getBean("postService");

        assertThat(postService).isNotNull();
    }
}
