package com.matheus.listaDeTarefas.exceptions;

public class TaskNotFoundExceptions extends RuntimeException {

    public TaskNotFoundExceptions() {
        super("Task not found");
    }
}
