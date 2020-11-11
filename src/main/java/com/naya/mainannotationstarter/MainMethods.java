package com.naya.mainannotationstarter;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class MainMethods {

    public List<Method> methodsList = new ArrayList<>();

    public void addMainMethods(Object bean) {
        Class<?> aClass = bean.getClass();
        Method[] methods = aClass.getDeclaredMethods();
        for (Method method : methods) {
            if(method.isAnnotationPresent(Main.class)){
                methodsList.add(method);
            }
        }
    }
}
