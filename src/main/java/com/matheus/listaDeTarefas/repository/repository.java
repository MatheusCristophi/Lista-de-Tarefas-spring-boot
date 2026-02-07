package com.matheus.listaDeTarefas.repository;

import com.matheus.listaDeTarefas.domain.tasks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface repository extends JpaRepository<tasks, Long> {
}
