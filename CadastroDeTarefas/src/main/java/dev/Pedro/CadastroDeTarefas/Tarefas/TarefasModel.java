package dev.Pedro.CadastroDeTarefas.tarefas;

import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.Pedro.CadastroDeTarefas.funcionarios.FuncionarioModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "Tb_Tarefas")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TarefasModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nomeDaTarefa;
    private String dificuldade;
    // um para muitos
    @OneToMany(mappedBy = "tarefas")
    @JsonIgnore
    private List<FuncionarioModel> funcionario;
}