package dev.Pedro.CadastroDeTarefas.funcionarios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {
    @Autowired
    private FuncionarioService funcionarioService;

    @GetMapping("/boasvindas")
    public String BoasVindas(){
        return "essa é a primeiras rota";
    }

    //add funcionario (create)
    @PostMapping("/criar")
    public FuncionarioModel criarFunc(@RequestBody FuncionarioModel funcionario){
        return funcionarioService.criarFuncionario(funcionario); // minúsculo = usa a instância
    }

    //procurar funcionario(read)
    @GetMapping("/listar")
    public List<FuncionarioModel> mostrarTodosFunc(){
        return funcionarioService.listarFuncionario();
    }

    //mostrar funciorio por id (read)
    @GetMapping("/todosId")
    public FuncionarioModel mostrarTodosFuncPorid(@RequestParam long id){
        Optional<FuncionarioModel> funcionarioPorId = funcionarioService.mostrarTodosFuncPorid(id);
        return funcionarioPorId.orElse(null);
    }

    //alterar dados(update)
    @PutMapping ("/alterar")
    public String alterPorId(){
        return "Alterar por id";
    }

    //delete(delete)
    @DeleteMapping("/deletarId/{id}")
    public String deletarPorId(@PathVariable long id){
        funcionarioService.deletarPorID(id);
        return "Funcionário deletado com sucesso";
    }
}