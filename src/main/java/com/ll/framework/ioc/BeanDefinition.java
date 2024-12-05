package com.ll.framework.ioc;

import com.ll.standard.util.Ut;
import lombok.Getter;

import java.lang.reflect.Parameter;
import java.util.Arrays;
import java.util.List;

public class BeanDefinition {
    @Getter
    private String name;
    @Getter
    private Class<?> cls;

    public BeanDefinition(Class<?> cls) {
        this.cls = cls;
        this.name = Ut.str.lcFirst(cls.getSimpleName());
    }

    public List<String> getParameterNames() {
        return Arrays
                .stream(
                        cls.getConstructors()[0].getParameters()
                )
                .map(Parameter::getName)
                .toList();

    }
}
