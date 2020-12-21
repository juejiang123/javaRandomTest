package com.itheima.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Quick3Controller {

    @Value("${student.name}")
    private String name;
    @Value("${student.addr}")
    private String addr;

    @RequestMapping("/quick3")
    @ResponseBody
    public String quick3(){
        return "name:"+name+",addr:"+addr;
    }

}
