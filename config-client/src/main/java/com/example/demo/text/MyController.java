package com.example.demo.text;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RefreshScope
@RestController
public class MyController {

    @Value("${name}")
    String foo;


    @RequestMapping(value = "/name",method = RequestMethod.GET)
    public String hi(){
        return foo;
    }

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String his(){
        return "ok";
    }



}
