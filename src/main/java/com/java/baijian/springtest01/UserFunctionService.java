package com.java.baijian.springtest01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by baijian on 16-8-28.
 */
@Service
public class UserFunctionService {

    @Autowired
    FunctionService functionService;

    public String SayHelloe() {
        return functionService.helloWord();
    }
}
