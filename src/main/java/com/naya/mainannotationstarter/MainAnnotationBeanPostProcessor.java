package com.naya.mainannotationstarter;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.Method;
import java.util.Arrays;

public class MainAnnotationBeanPostProcessor implements BeanPostProcessor {

    @Autowired
    private MainMethods mainMethods;

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        mainMethods.addMainMethods(bean);
        return bean;
    }
}
