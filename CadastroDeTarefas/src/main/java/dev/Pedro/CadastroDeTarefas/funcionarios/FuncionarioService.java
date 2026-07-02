package dev.Pedro.CadastroDeTarefas.funcionarios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    public List<FuncionarioModel> listarFuncionario(){
        return funcionarioRepository.findAll();
    }
}