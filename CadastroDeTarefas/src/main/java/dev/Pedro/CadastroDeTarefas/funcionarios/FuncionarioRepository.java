package dev.Pedro.CadastroDeTarefas.funcionarios;
import dev.Pedro.CadastroDeTarefas.funcionarios.FuncionarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<FuncionarioModel, Long> {
}