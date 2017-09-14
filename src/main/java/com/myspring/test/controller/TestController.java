package com.myspring.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Created by zhuzq on 2017/9/14.
 */
@Controller
public class TestController {
    @RequestMapping(value = "/admin")
    @ResponseBody
    public String testSpring(){
        return "My testSpring";
    }
}