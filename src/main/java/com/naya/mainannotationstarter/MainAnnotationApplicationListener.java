package com.naya.mainannotationstarter;

import lombok.SneakyThrows;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.List;

public class MainAnnotationApplicationListener implements ApplicationListener<ContextRefreshedEvent> {
    @Autowired
    MainMethods methods;

    @SneakyThrows
    private static void invoke(Method method,ApplicationContext context) {
        Object bean = context.getBean(method.getDeclaringClass());
        method.invoke(bean);
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        ApplicationContext context = contextRefreshedEvent.getApplicationContext();

        methods.methodsList.forEach(method -> invoke(method,context));
    }
}
