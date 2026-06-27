package dev.Pedro.CadastroDeTarefas.tarefas;

import org.springframework.data.jpa.repository.JpaRepository;

public interface tarefasRepository extends JpaRepository<TarefasModel, Long> {
}