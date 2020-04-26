package com.example.bootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * Created by ii97 on 20.4.26.
 */
@Controller
public class testController {
    @ResponseBody
    @RequestMapping("/testcontroller")
    public String resp(){
        return "success" + new Date();
    }
}
