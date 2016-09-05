package com.java.baijian.springtest02;

import org.springframework.stereotype.Service;

/**
 * Service
 * Created by baijian on 16-8-28.
 */
@Service
public class FunctionService {

    public String helloWord(String word) {
        return "Hello World!"+word;
    }

}