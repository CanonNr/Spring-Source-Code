package com.example.lksun.config;

import com.example.lksun.entity.User;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class DemoBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        if(o instanceof User){
            User user = (User)o;
            System.out.println(user);
            user.setName("niuniu");
            System.out.println("User 设置了新名字... niuniu");
            return user;
        }
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        return o;
    }
}
