package com.example.lksun;

import com.example.lksun.service.TestService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestForJavaConfig {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(TestService.class);
        applicationContext.refresh();
        TestService testService = (TestService)applicationContext.getBean("TestService");

        System.out.println(testService.add(5, 5));

    }
}
