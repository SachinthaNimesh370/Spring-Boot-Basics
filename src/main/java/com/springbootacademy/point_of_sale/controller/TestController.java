package com.springbootacademy.point_of_sale.controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("api/v1/test")
public class TestController {

    @GetMapping("/get-text-method-01")
    public String getMyTest(){
        String myText ="get-text-method-01";
        System.out.println(myText);
        return myText;
    }

    @GetMapping("/get-text-method-02")
    public String getMyTest1(){
        String myText ="get-text-method-02";
        System.out.println(myText);
        return myText;
    }
}
