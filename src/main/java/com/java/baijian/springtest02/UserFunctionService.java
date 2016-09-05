package com.java.baijian.springtest02;

import org.springframework.stereotype.Service;

/**
 * Created by baijian on 16-8-28.
 */
@Service
public class UserFunctionService {

    FunctionService functionService;

    public void setFunctionService(FunctionService functionService) {
        this.functionService = functionService;
    }

    public String SayHelloe() {
        return functionService.helloWord("baijian");
    }
}
