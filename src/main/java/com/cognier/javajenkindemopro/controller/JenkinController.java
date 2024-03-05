package com.cognier.javajenkindemopro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class JenkinController {

    @GetMapping("/data")
    public String getData(){
        return "Hi this Demo Project for jenkin in AWS Env by Radha";
    }

    @GetMapping("/info")
    public String getInfo(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        System.out.println(dateFormat.format(date));
        String format = dateFormat.format(date);
        return "Today :: "+format;
    }

    @GetMapping("/infoData")
    public String getInfoData(){
        return "Hi this Demo Project for jenkin in AWS Env by Mani";
    }
}
