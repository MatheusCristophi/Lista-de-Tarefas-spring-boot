package com.matheus.listaDeTarefas.infra;

import com.matheus.listaDeTarefas.exceptions.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class restExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(TaskNotFoundExceptions.class)
    private ResponseEntity<String> taskNotFoundException(TaskNotFoundExceptions exception){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Task not found");
    }

    private ResponseEntity<String> TaskAlreadyExistsExceptions(TaskAlreadyExistsExceptions exceptions){
        return ResponseEntity.status(HttpStatus.CONFLICT).body("Task already exists");
    }

    private ResponseEntity<String> InvalidTaskException(InvalidTaskException exception){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid task");
    }

    private ResponseEntity<String> EmptyTaskListException(EmptyTaskListException exception){
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Task list is empty");
    }

    private ResponseEntity<String> CantCreateTaskException(CantCreateTaskException exception){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Can't create task");
    }
}
