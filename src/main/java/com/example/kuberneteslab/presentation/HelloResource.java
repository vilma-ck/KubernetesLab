package com.example.kuberneteslab.presentation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Vilma Couturier Kaijser
 * Date: 2021-09-16
 * Project: KubernetesLab
 * Copyright: MIT
 */
@RestController
public class HelloResource {

    @GetMapping("/hello")
    public String getHello(){
        return "Hello world";
    }
}


// http://localhost:8080/hello