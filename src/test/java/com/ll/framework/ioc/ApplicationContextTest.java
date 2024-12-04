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
}
