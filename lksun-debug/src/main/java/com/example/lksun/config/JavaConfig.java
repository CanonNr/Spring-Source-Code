package com.example.lksun.config;

import com.example.lksun.service.TestService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    @Bean("testService")
    public TestService testService(){
        return new TestService();
    }

}
