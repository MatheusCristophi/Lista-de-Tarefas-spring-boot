package com.matheus.listaDeTarefas.exceptions;

import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


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

    public class emptyTaskListException extends RuntimeException {

    public emptyTaskListException() { super("Task list is empty");}

    public emptyTaskListException(String message)  { super(message);}
    }

    public class cantCreateTaskException extends RuntimeException {

    public cantCreateTaskException() { super("Can't create task");}

    public cantCreateTaskException(String message) { super(message);}
    }
}