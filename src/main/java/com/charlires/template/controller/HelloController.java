package com.charlires.template.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by carlos_andonaegui on 7/2/14.
 */

@Controller
public class HelloController {


    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello Andy";
    }

}
