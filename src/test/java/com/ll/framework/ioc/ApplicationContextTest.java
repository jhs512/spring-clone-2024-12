package com.ll.framework.ioc;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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
