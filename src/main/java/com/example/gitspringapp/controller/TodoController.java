package com.example.gitspringapp.controller;

import com.example.gitspringapp.model.Todo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class TodoController {


    private final ArrayList<Todo> todos=new ArrayList<>();


    @GetMapping
    public ResponseEntity getTodo(){
        return ResponseEntity.status(200).body(todos);
    }

    @PostMapping
    public ResponseEntity addTodo(@RequestBody  Todo todoItem){
        todos.add(todoItem);
        return ResponseEntity.status(200).body(todos);
    }
}
