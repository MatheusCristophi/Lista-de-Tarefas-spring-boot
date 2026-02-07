package com.matheus.listaDeTarefas.exceptions;

public class CantCreateTaskException extends RuntimeException {

    public CantCreateTaskException() {
        super("Can't create task");
    }

}
