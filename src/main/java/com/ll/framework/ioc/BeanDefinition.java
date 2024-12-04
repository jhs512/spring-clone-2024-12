package com.ll.framework.ioc;

import com.ll.standard.util.Ut;
import lombok.Getter;

public class BeanDefinition {
    @Getter
    private String name;
    @Getter
    private Class<?> cls;

    public BeanDefinition(Class<?> cls) {
        this.cls = cls;
        this.name = Ut.str.lcFirst(cls.getSimpleName());
    }
}
