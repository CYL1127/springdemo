package com.example.springdemo.controller;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


@RestController
@EnableAutoConfiguration
public class helloworld {
    @RequestMapping("/hello")
    private String hello(){
        return "Hello World!";
    }
    @GetMapping("/index")
    private ModelAndView index(){
        return new ModelAndView("index");
    }
    @RequestMapping(value = "/ajax", method = RequestMethod.GET)
    private String loginByGet(@RequestParam(value = "name") String name,
                             @RequestParam(value = "pwd") String pwd) {
        return "succeed" +name +pwd;
    }
    @RequestMapping(value = "/ajax", method = RequestMethod.POST)
    private String loginByPost(@RequestParam(value = "name") String name,
                              @RequestParam(value = "pwd") String pwd) {
        return "succeed" +name +pwd;
    }
}


