package dev.Pedro.CadastroDeTarefas.funcionarios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    public List<FuncionarioModel> listarFuncionario(){
        return funcionarioRepository.findAll();
    }

    public Optional<FuncionarioModel> mostrarTodosFuncPorid(long id){
        return funcionarioRepository.findById(id);
    }

    public FuncionarioModel criarFuncionario(FuncionarioModel funcionario){
        return funcionarioRepository.save(funcionario);
    }

    // deletar funcionario
    public void deletarPorID(long id){
        funcionarioRepository.deleteById(id);
    }
    // atualizar funcionario
    public FuncionarioModel atualizarFuncionario(Long id, FuncionarioModel funcionario){
        if(funcionarioRepository.existsById(id)){
            funcionario.setId(id);
            return funcionarioRepository.save(funcionario);
        }
        return null;
    }
}