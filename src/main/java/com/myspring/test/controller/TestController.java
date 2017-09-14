package com.myspring.test.controller;

import com.myspring.test.utils.JsonResult;
import com.sun.org.apache.xpath.internal.operations.String;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhuzq on 2017/9/14.
 */
@Controller
public class TestController {
    @RequestMapping(value = "/admin")
    @ResponseBody
    public java.lang.String testSpring(){
        JsonResult result = new JsonResult();
        result.success();
        return result.toJsonStr();
    }













}