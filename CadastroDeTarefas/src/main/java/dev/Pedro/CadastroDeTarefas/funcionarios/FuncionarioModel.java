package dev.Pedro.CadastroDeTarefas.funcionarios;

import dev.Pedro.CadastroDeTarefas.tarefas.TarefasModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "tb_cadastro")
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString (exclude = "Tarefas")
public class FuncionarioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id")
    Long id;
    @Column(name = "nome")
    private String nome;
    @Column(unique=true)
    private String email;
    @Column (name = "imgUrl")
    private String imgUrl;
    @Column (name="idade")
    private int idade;
    // ManyToOne um funcionario tem uma unica tarefa
    @ManyToOne
    private TarefasModel tarefas;
}