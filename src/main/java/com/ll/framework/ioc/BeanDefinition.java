package com.ll.framework.ioc;

import com.ll.standard.util.Ut;

public class BeanDefinition {
    private String name;
    private Class<?> cls;

    public BeanDefinition(Class<?> cls) {
        this.cls = cls;
        this.name = Ut.str.lcFirst(cls.getSimpleName());
    }
}
