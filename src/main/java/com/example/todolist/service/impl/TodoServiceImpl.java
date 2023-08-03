package com.example.todolist.service.impl;

import com.example.todolist.entity.Todo;
import com.example.todolist.repository.TodoRepository;
import com.example.todolist.service.TodoServices;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TodoServiceImpl implements TodoServices {

    private final TodoRepository todoRepository;
    @Override
    public Todo create(Todo todo) {
        return todoRepository.save(todo);
    }

    @Override
    public Todo update(Todo todo, int id) {
        Todo todo1 = todoRepository.findById(id).get();
        todo1.setCompleted(todo.isCompleted());
        return todoRepository.save(todo1);
    }

    @Override
    public void delete(int id) {
        todoRepository.deleteById(id);
    }

    @Override
    public List<Todo> getAll() {
        return todoRepository.findAll();
    }
}
