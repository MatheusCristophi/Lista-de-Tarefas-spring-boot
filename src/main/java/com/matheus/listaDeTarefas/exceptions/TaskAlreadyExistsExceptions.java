package com.matheus.listaDeTarefas.exceptions;

public class TaskAlreadyExistsExceptions extends RuntimeException {
    public TaskAlreadyExistsExceptions(){super("task already exists");}
}
