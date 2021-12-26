package com.example.demo3.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
@CrossOrigin(origins = "*")
public class DemoController {

    @RequestMapping(value = "/getUserName", method = RequestMethod.GET)
    public String getUserName() {
        return "屈嘉程";
    }
}
