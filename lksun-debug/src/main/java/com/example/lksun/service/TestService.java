package com.example.lksun.service;

import org.springframework.stereotype.Service;

@Service("TestService")
public class TestService {
    public int add(int a ,int b){
        return a+b;
    }
}
