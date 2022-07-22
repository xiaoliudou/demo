package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenyuhao_a
 */
@RestController
public class IndexController {
    @GetMapping(value = "index",name = "test2")
    public String index(@RequestParam(value = "index",required = false)String name){

        return "index";
    }
}
