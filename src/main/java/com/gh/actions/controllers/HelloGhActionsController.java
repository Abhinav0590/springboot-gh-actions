package com.gh.actions.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloGhActionsController {

    @GetMapping("/hello")
    public String getGreetings() {
        return "hello from gh-actions controller!$$&&//// vacation starting soon!!!!!!!!!!!!!!";

    }

}
