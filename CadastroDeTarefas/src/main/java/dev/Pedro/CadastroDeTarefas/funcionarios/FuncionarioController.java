package dev.Pedro.CadastroDeTarefas.funcionarios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {
    @Autowired
    private dev.Pedro.CadastroDeTarefas.funcionarios.FuncionarioService funcionarioService;

    @GetMapping("/boasvindas")
    public String BoasVindas(){
        return "essa é a primeiras rota";
    }

    //add funcionario (create)
    @PostMapping("/criar")
    public dev.Pedro.CadastroDeTarefas.funcionarios.FuncionarioModel criarFunc(@RequestBody dev.Pedro.CadastroDeTarefas.funcionarios.FuncionarioModel funcionario){
        return funcionarioService.criarFuncionario(funcionario); // minúsculo = usa a instância
    }

    //procurar funcionario(read)
    @GetMapping("/listar")
    public List<dev.Pedro.CadastroDeTarefas.funcionarios.FuncionarioModel> mostrarTodosFunc(){
        return funcionarioService.listarFuncionario();
    }

    //mostrar funciorio por id (read)
    @GetMapping("/todosId")
    public dev.Pedro.CadastroDeTarefas.funcionarios.FuncionarioModel mostrarTodosFuncPorid(@RequestParam long id){
        Optional<dev.Pedro.CadastroDeTarefas.funcionarios.FuncionarioModel> funcionarioPorId = funcionarioService.mostrarTodosFuncPorid(id);
        return funcionarioPorId.orElse(null);
    }

    //alterar dados(update)
    @PutMapping("/alterar/{id}")
    public dev.Pedro.CadastroDeTarefas.funcionarios.FuncionarioModel alterPorId(@PathVariable Long id, @RequestBody dev.Pedro.CadastroDeTarefas.funcionarios.FuncionarioModel funcionarioAtualizado){
        return funcionarioService.atualizarFuncionario(id, funcionarioAtualizado);
    }

    //delete(delete)
    @DeleteMapping("/deletarId/{id}")
    public String deletarPorId(@PathVariable long id){
        funcionarioService.deletarPorID(id);
        return "Funcionário deletado com sucesso";
    }
}