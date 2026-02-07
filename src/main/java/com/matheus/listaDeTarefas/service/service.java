package com.matheus.listaDeTarefas.service;

import com.matheus.listaDeTarefas.domain.tasks;
import com.matheus.listaDeTarefas.exceptions.EmptyTaskListException;
import com.matheus.listaDeTarefas.exceptions.InvalidTaskException;
import com.matheus.listaDeTarefas.exceptions.TaskIdNotFoundExceptions;
import com.matheus.listaDeTarefas.repository.repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class service {

    private final repository repository;
    public service(repository repository) {
        this.repository = repository;
    }

    public tasks createTasks(tasks task) {
        if (task == null || task.getName() == null){
            throw new InvalidTaskException();
        }
        return repository.saveAndFlush(task);
    }

    public List<tasks> readAllTasks() {
       List<tasks> tasksList = repository.findAll();
       if(tasksList.isEmpty()){
           throw new EmptyTaskListException();
       }
       return tasksList;
    }

    public tasks readTaskById(Long id) {
        if(!repository.existsById(id)){
            throw new TaskIdNotFoundExceptions(id);
        }else{
            return repository.findById(id).orElseThrow(() -> new TaskIdNotFoundExceptions(id));
        }
    }

    public tasks updateTask(Long id, tasks updateTask){
        tasks existingTask = repository.findById(id).orElseThrow(() -> new TaskIdNotFoundExceptions(id));
        existingTask.setName(updateTask.getName());
        existingTask.setDescription(updateTask.getDescription());
        existingTask.setDueDate(updateTask.getDueDate());
        return repository.saveAndFlush(existingTask);
    }

    public void deleteAllTasks(){
        if(repository.count() == 0){
            throw new EmptyTaskListException();
        }
        repository.deleteAll();
    }

    public void deleteTaskById(Long id) {
        if (!repository.existsById(id)) {
            throw new TaskIdNotFoundExceptions(id);
        }
        repository.deleteById(id);
    }
}