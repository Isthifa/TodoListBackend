package com.example.todolist.controller;

import com.example.todolist.entity.Todo;
import com.example.todolist.service.TodoServices;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:3000")
public class TodoController {
    @Autowired
    private final TodoServices todoServices;

    @PostMapping("/create")
    public Todo create(@RequestBody Todo todo){
        return todoServices.create(todo);
    }
    @GetMapping("/List")
    public List<Todo> getAll(){

        return todoServices.getAll();
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id){
        todoServices.delete(id);
    }

    @PutMapping("/update/{id}")
    public Todo update(@RequestBody Todo todo, @PathVariable int id){
        return todoServices.update(todo, id);
    }
}
