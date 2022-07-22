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
    @GetMapping(value = "hello",name = "index")
    public String index(@RequestParam(value = "name",required = false)String name){
        String result = "hello";
        return result;
    }
}
