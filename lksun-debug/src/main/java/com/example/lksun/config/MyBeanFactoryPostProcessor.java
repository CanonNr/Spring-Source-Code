package com.example.lksun.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("调用MyBeanFactoryPostProcessor的postProcessBeanFactory");
        BeanDefinition bd = beanFactory.getBeanDefinition("UserEntity");
        System.out.println("属性值============" + bd.getPropertyValues().toString());
        MutablePropertyValues pv =  bd.getPropertyValues();
        if (pv.contains("name")) {
            pv.addPropertyValue("name", "baba");
            System.out.println("User 设置了新名字... baba");
        }
        bd.setScope(BeanDefinition.SCOPE_PROTOTYPE);
    }

}