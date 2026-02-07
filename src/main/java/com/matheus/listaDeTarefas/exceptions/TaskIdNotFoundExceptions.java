package com.matheus.listaDeTarefas.exceptions;

public class TaskIdNotFoundExceptions extends RuntimeException {
    public TaskIdNotFoundExceptions(Long id) {super ("Task with id "+id+"  not found");}
}
