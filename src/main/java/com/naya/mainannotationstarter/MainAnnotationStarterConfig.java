package com.naya.mainannotationstarter;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@EnableConfigurationProperties
public class MainAnnotationStarterConfig {
    @Bean
    public MainAnnotationApplicationListener mainAnnotationApplicationListener(){
        return new MainAnnotationApplicationListener();
    }
    @Bean
    public MainMethods mainMethods(){
        return new MainMethods();
    }
    @Bean
    public MainAnnotationBeanPostProcessor mainAnnotationBeanPostProcessor(){
        return new MainAnnotationBeanPostProcessor();
    }
}
