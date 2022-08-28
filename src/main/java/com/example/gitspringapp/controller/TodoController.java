package com.example.gitspringapp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class TodoController {


    private final ArrayList<String> todos=new ArrayList<>();


    @GetMapping
    public ResponseEntity getTodo(){
        return ResponseEntity.status(200).body(todos);
    }
}
