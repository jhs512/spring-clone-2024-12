package com.ll.framework.ioc;

import com.ll.domain.post.post.service.PostService.PostService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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
}
