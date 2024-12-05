package com.ll.global.initData;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ll.framework.ioc.ApplicationRunner;
import com.ll.framework.ioc.annotations.Bean;
import com.ll.framework.ioc.annotations.Configuration;

@Configuration
public class All {
    @Bean
    public ApplicationRunner initDataAll(ObjectMapper commonObjectMapper) {
        return args -> {
            System.out.println("Hello, World!");
        };
    }
}
