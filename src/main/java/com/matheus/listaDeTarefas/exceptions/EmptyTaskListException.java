package com.matheus.listaDeTarefas.exceptions;

public class EmptyTaskListException extends RuntimeException {

    public EmptyTaskListException() {
        super("Task list is empty");
    }
}
