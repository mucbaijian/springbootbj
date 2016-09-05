package com.java.baijian.springtest02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by baijian on 16-8-29.
 */
@Configuration

public class JavaConfig {

    @Bean
    public FunctionService functionService() {
        return new FunctionService();
    }

    @Bean
    public UserFunctionService userFunctionService() {
        UserFunctionService userFunctionService = new UserFunctionService();
        userFunctionService.setFunctionService(functionService());
        return userFunctionService;
    }


}
