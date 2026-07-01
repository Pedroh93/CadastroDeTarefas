package dev.Pedro.CadastroDeTarefas.funcionarios;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class FuncionarioController {
    @GetMapping("/boasvindas")
    public String BoasVindas(){
        return "essa é a primeiras rota";}
        //add funcionario (create)
        @PostMapping("/criar")
        public String criarFunc(){
            return "funcionario criado";
        }

        //procurar funcionario(read)
        @GetMapping("/todos")
        public String mostrarTodosFunc(){
            return "mostra funciorio";
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
