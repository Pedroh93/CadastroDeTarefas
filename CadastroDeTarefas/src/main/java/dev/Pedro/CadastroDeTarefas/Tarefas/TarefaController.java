package dev.Pedro.CadastroDeTarefas.tarefas;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tarefa")
public class TarefaController {

    @Autowired
    private dev.Pedro.CadastroDeTarefas.tarefas.TarefaService tarefaService;

    @GetMapping("/listar")
    public List<dev.Pedro.CadastroDeTarefas.tarefas.TarefasModel> listarTarefas(){
        return tarefaService.listarTarefas();
    }

    @GetMapping("/buscarId")
    public dev.Pedro.CadastroDeTarefas.tarefas.TarefasModel buscarTarefaPorId(@RequestParam long id){
        Optional<dev.Pedro.CadastroDeTarefas.tarefas.TarefasModel> tarefaPorId = tarefaService.buscarTarefaPorId(id);
        return tarefaPorId.orElse(null);
    }

    @PostMapping("/criar")
    public dev.Pedro.CadastroDeTarefas.tarefas.TarefasModel criarTarefa(@RequestBody dev.Pedro.CadastroDeTarefas.tarefas.TarefasModel tarefa){
        return tarefaService.criarTarefa(tarefa);
    }

    @PutMapping("/alterar/{id}")
    public dev.Pedro.CadastroDeTarefas.tarefas.TarefasModel alterarTarefa(@PathVariable Long id, @RequestBody dev.Pedro.CadastroDeTarefas.tarefas.TarefasModel tarefaAtualizada){
        return tarefaService.atualizarTarefa(id, tarefaAtualizada);
    }

    @DeleteMapping("/deletar/{id}")
    public String deletarTarefa(@PathVariable long id){
        tarefaService.deletarPorId(id);
        return "Tarefa deletada com sucesso";
    }
}