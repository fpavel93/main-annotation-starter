package com.naya.mainannotationstarter;

import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Main {
}
