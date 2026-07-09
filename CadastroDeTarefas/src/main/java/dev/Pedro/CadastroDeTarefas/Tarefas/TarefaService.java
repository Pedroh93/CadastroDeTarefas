package dev.Pedro.CadastroDeTarefas.tarefas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TarefaService {

    @Autowired
    private dev.Pedro.CadastroDeTarefas.tarefas.TarefasRepository tarefasRepository;

    public List<dev.Pedro.CadastroDeTarefas.tarefas.TarefasModel> listarTarefas() {
        return tarefasRepository.findAll();
    }

    public Optional<dev.Pedro.CadastroDeTarefas.tarefas.TarefasModel> buscarTarefaPorId(long id) {
        return tarefasRepository.findById(id);
    }

    public dev.Pedro.CadastroDeTarefas.tarefas.TarefasModel criarTarefa(dev.Pedro.CadastroDeTarefas.tarefas.TarefasModel tarefa) {
        return tarefasRepository.save(tarefa);
    }

    public void deletarPorId(long id) {
        tarefasRepository.deleteById(id);
    }

    public dev.Pedro.CadastroDeTarefas.tarefas.TarefasModel atualizarTarefa(long id, dev.Pedro.CadastroDeTarefas.tarefas.TarefasModel tarefa) {
        if (tarefasRepository.existsById(id)) {
            tarefa.setId(id);
            return tarefasRepository.save(tarefa);
        }
        return null;
    }
}