package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class demoController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(@RequestParam(value = "nickname",required = false) String name, String phone) {
        System.out.println(phone);
        return "你好" + name;
    }
}
