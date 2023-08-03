package com.example.todolist.service;

import com.example.todolist.entity.Todo;

import java.util.List;

public interface TodoServices {
    Todo create(Todo todo);
    Todo update(Todo todo, int id);
    void delete(int id);
    List <Todo> getAll();
}
