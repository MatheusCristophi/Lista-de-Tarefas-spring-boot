package com.matheus.listaDeTarefas.infra;

import com.matheus.listaDeTarefas.exceptions.exceptions;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class resrtExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(exceptions.taskNotFoundException.class)
    private ResponseEntity<String> taskNotFoundException(exceptions.taskNotFoundException exception){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Task not found");
    }

    private ResponseEntity<String> taskAlreadyExistsException(exceptions.taskAlreadyExistsException exception){
        return ResponseEntity.status(HttpStatus.CONFLICT).body("Task already exists");
    }

    private ResponseEntity<String> invalidTaskException(exceptions.invalidTaskException exception){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid task");
    }

    private ResponseEntity<String> emptyTaskListException(exceptions.emptyTaskListException exception){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Task list is empty");
    }

    private ResponseEntity<String> cantCreateTaskException(exceptions.cantCreateTaskException exception){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Can't create task");
    }
}
