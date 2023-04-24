package com.abhi.depoloywebapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class Simple {

    @GetMapping("/{name}")
    public String getUserPrint(@PathVariable String name){
        return "Hi "+name+", Welcoming you from the new place.";
    }
}
