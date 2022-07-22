package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenyuhao_a
 */
@RestController
@RequestMapping("/test")
public class HelloController {
    @GetMapping(value = "hello")
    public String hello(@RequestParam(value = "name",required = false)String name){
        String result = name;
        return result;
    }
}
