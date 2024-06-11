package com.bosch.exer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.bosch.exer.impl.DefaultReversePlain;
import com.bosch.exer.services.ReverseService;

@Configuration
public class DependenciesConfiguration {
   
    @Bean
    @Scope("singleton")
    public ReverseService reverseService() {
        return new DefaultReversePlain();
    }
}
