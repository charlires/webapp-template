package com.charlires.template.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by carlos_andonaegui on 7/2/14.
 */

@Controller
public class HelloController {


    final Logger log = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        log.debug("hello gets hit!");
        return "Hello Andy";
    }

}
