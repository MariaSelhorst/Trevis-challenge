package com.bosch.exer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.bosch.exer.dto.Reversedto;
import com.bosch.exer.services.ReverseService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class ReverseController {
    
    @Autowired
    ReverseService rev;

    @GetMapping("reverse/{word}")
    public Reversedto getMethodName(@PathVariable String word) {
        System.out.println(rev.reverse(word));

        return rev.reverse(word);
    }
    
}
