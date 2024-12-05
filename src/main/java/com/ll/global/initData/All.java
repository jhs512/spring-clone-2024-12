package com.ll.global.initData;

import com.ll.framework.ioc.ApplicationRunner;
import com.ll.framework.ioc.annotations.Bean;
import com.ll.framework.ioc.annotations.Configuration;

@Configuration
public class All {
    @Bean
    public ApplicationRunner initDataAll() {
        return args -> {
            System.out.println("Hello, World!");
        };
    }
}
