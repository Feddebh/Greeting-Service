package com.example.greeting.controller;

import com.example.greeting.domain.Greeting;
import com.example.greeting.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GreetingController {

  @Autowired
  private GreetingService service;

    @GetMapping ("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue = "World")String name){
        return service.greet(name);
    }

}
