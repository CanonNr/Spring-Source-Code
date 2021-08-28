package com.example.lksun;

import com.example.lksun.entity.User;
import com.example.lksun.service.TestService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestForXml {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
        User user = (User) context.getBean("UserEntity");
        user.setName("sun");
        user.setAddress("beijing");
        System.out.println(user);
    }
}
