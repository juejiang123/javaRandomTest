package com.itheima.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ConfigurationProperties("student")
public class Quick4Controller {

//    @Value("${student.name}")
    private String name;
//    @Value("${student.addr}")
    private String addr;
    private Integer age;

    @RequestMapping("/quick4")
    @ResponseBody
    public String quick3(){
        return "name:"+name+",addr:"+addr+",age:"+age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
