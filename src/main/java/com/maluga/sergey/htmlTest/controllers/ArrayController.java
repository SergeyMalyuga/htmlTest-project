package com.maluga.sergey.htmlTest.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/array")
public class ArrayController {

    @GetMapping
    public String getDate(@RequestParam(name = "departure") String departu) {
        return departu;
    }

    @GetMapping("/url")
    public String getHttp(@RequestParam(name = "refer") String refer) {
        return refer;
    }
}
