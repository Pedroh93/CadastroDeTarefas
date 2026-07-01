package Tarefas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("missoes")
public class TarefaController {
    // get - mandar um requisão para alterar
    @GetMapping ("/listar")
    public String listarTarefas(){
        return "Listado com sucesso";
    }
    //post mandar requisão para criar
    @PostMapping("/criar")
    public String criarTarefa(){
        return "missão criada";
    }
   @PutMapping("/alterar")
    public String alterarTarefa(){
        return "Alterada a rota";
    }
    @DeleteMapping("/deletar")
    public String deletarTarefa(){
        return " deletada a rota";
    }


}
