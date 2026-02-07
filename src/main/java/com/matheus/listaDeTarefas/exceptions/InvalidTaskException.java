package com.matheus.listaDeTarefas.exceptions;

public class InvalidTaskException extends RuntimeException {

    public InvalidTaskException() {
        super("Invalid task");
    }

}
