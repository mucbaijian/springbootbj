package com.java.baijian.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by baijian on 16-9-5.
 */
@Controller
public class HellowController {
    @RequestMapping("/index")
    public String hello(){
        return "index";
    }
}
