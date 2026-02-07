package com.matheus.listaDeTarefas.controller;

import com.matheus.listaDeTarefas.exceptions.exceptions;
import com.matheus.listaDeTarefas.domain.tasks;
import com.matheus.listaDeTarefas.repository.repository;
import com.matheus.listaDeTarefas.service.service;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tasks")

public class control {
    repository repository;
    service service;
    exceptions exception;

    public control(repository repository) {
        this.repository = repository;
    }

    public control(service service) {
        this.service = service;
    }

    public control(exceptions exception) {
        this.exception = exception;
    }

    @GetMapping("/alltasks")
    public ResponseEntity<tasks> getAllTasks() {
        service.readAllTasks() ;
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/taskbyid")
    public ResponseEntity<tasks> getTaskById(@PathVariable Long id) {
        service.readTaskById(id);
        return new ResponseEntity(HttpStatus.OK);
    }

    @PostMapping("/createtask")
    public ResponseEntity<tasks> createTask(@RequestBody tasks task) {
        service.createTasks(task);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @DeleteMapping("/deletetaskbyid")
    public void deleteTaskById(Long id) {
        service.deleteTaskById(id);
        new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/deletealltasks")
    public void deleteAllTasks() {
        service.deleteAllTasks();
        new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @PutMapping("/updatetaskbyid")
    public ResponseEntity<tasks> updateTaskById(Long id, tasks task) {
        service.updateTaskById(id, task);
        return new ResponseEntity(HttpStatus.OK);
    }
}
