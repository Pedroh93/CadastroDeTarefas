package dev.Pedro.CadastroDeTarefas.funcionarios;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class FuncionarioController {
    @GetMapping("/boasvindas")
    public String BoasVindas(){
        return "essa é a primeiras rota";
    }
}