package com.matheus.listaDeTarefas.exceptions;


import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice

public class exceptions extends ResponseEntityExceptionHandler {

    public class taskNotFoundException extends RuntimeException {

    public taskNotFoundException() { super("Task not found");}

    public taskNotFoundException(String message) { super(message);}
    }

    public class taskAlreadyExistsException extends RuntimeException {

    public taskAlreadyExistsException() { super("Task already exists");}

    public taskAlreadyExistsException(String message) { super(message);}
    }

    public class invalidTaskException extends RuntimeException {

    public invalidTaskException() { super("Invalid task");}

    public invalidTaskException (String message) { super(message);}

    }
}