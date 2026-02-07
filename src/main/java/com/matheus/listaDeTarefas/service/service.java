package com.matheus.listaDeTarefas.service;

import com.matheus.listaDeTarefas.domain.tasks;
import com.matheus.listaDeTarefas.repository.repository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service

public class service {
    repository repository;

    public service(repository repository) {
        this.repository = repository;
    }

    public ResponseEntity<tasks> createTasks(tasks task) {
        repository.saveAndFlush(task);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    public ResponseEntity<tasks> readAllTasks() {
        repository.findAll();
        return new ResponseEntity(HttpStatus.OK);
    }

    public ResponseEntity<tasks> readTaskById(Long id) {
        repository.findById(id);
        return new ResponseEntity(HttpStatus.OK);
    }

    public void deleteTaskById(Long id) {
        repository.deleteById(id);
        new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    public void deleteAllTasks() {
        repository.deleteAll();
        new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    public ResponseEntity<tasks> updateTaskById(Long id, tasks task) {
        repository.findById(id);
        repository.saveAndFlush(task);
        return new ResponseEntity(HttpStatus.OK);
    }
}
