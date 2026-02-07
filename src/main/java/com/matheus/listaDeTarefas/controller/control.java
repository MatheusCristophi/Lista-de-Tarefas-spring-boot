package com.matheus.listaDeTarefas.controller;


import com.matheus.listaDeTarefas.domain.tasks;
import com.matheus.listaDeTarefas.repository.repository;
import com.matheus.listaDeTarefas.service.service;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")

public class control {
    private final service service;

    public control(service service) {
        this.service = service;
    }

    @GetMapping("/alltasks")
    public ResponseEntity<List<tasks>> getAllTasks() {
        return ResponseEntity.ok(service.readAllTasks());
    }

    @GetMapping("/taskbyid/{id}")
    public ResponseEntity<tasks> getTaskById(@PathVariable Long id) {
        return ResponseEntity.ok(service.readTaskById(id));
    }

    @PostMapping("/createtask")
    public ResponseEntity<tasks> createTask(@RequestBody tasks task) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(service.createTasks(task));
    }

    @DeleteMapping("/deletetaskbyid/{id}")
    public ResponseEntity<tasks> deleteTaskById(@PathVariable Long id) {
        return ResponseEntity.ok(service.deleteTaskById(id));
    }

    @DeleteMapping("/deletealltasks")
    public void deleteAllTasks() {
        service.deleteAllTasks();
        new ResponseEntity(HttpStatus.OK);
    }

    @PutMapping("/updatetaskbyid/{id}")
    public ResponseEntity<tasks> updateTaskById(@PathVariable Long id,@RequestBody tasks task) {
        return ResponseEntity.ok(service.updateTask(id, task));
    }
}
