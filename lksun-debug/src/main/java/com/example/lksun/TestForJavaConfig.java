package com.example.lksun;

import com.example.lksun.config.JavaConfig;
import com.example.lksun.service.TestService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestForJavaConfig {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);
        TestService testService = (TestService)applicationContext.getBean("testService");

        System.out.println(testService.add(5, 5));

    }
}
