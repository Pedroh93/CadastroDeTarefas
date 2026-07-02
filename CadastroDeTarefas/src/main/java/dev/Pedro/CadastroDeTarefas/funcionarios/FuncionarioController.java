package dev.Pedro.CadastroDeTarefas.funcionarios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {
    @Autowired
    private FuncionarioService funcionarioService;
    @GetMapping("/boasvindas")
    public String BoasVindas(){
        return "essa é a primeiras rota";}
        //add funcionario (create)
        @PostMapping("/criar")
        public String criarFunc(){
            return "funcionario criado";
        }


        //procurar funcionario(read)
        @GetMapping("/listar")
        public List<FuncionarioModel> mostrarTodosFunc(){
            return funcionarioService.listarFuncionario();
        }

        //mostrar funciorio por id (read)
        @GetMapping("/todosId")
        public String mostrarTodosFuncPorid(){
            return "mostra funciorio por id";
        }


        //alterar dados(update)
        @PutMapping ("/alterar")
       public  String alterPorId(){
        return "Alterar por id";
        }

        //delete(delete)
        @DeleteMapping("/deletarId")
    public String DeletarPorId(){
        return "deletar por id";
        }
    }
