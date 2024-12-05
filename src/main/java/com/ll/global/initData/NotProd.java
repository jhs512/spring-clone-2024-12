package com.ll.global.initData;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ll.domain.member.member.service.MemberService;
import com.ll.framework.ioc.annotations.Bean;
import com.ll.framework.ioc.annotations.Configuration;
import lombok.RequiredArgsConstructor;

@Configuration
@RequiredArgsConstructor
public class NotProd {
    private final MemberService memberService;

    @Bean
    public ObjectMapper commonObjectMapper() {
        return new ObjectMapper();
    }
}
