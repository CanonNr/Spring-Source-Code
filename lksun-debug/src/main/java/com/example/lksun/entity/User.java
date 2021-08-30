package com.example.lksun.entity;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;

public class User implements BeanNameAware, InitializingBean {
    public A a;

    public String name;

    public String address;

    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "a=" + a +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public void setBeanName(String name) {
        System.out.println(name);
        this.setAddress(name);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("----------afterPropertiesSet----------");
        System.out.println(this);
        System.out.println("----------afterPropertiesSet----------");
    }

    public void test(){
        System.out.println("----------test----------");
        System.out.println(this);
        System.out.println("----------test----------");
    }
}
