package com.ramiro.demofunctional.usecases.cadastrarclientes;

import com.ramiro.demofunctional.repository.CadastrarClientesRepo;
import org.springframework.stereotype.Service;

@Service
public class CadastrarUseCaseImpl implements CadastrarUseCase {

    private static final String CADASTRO_EFETUADO_COM_SUCESSO = "Cadastro efetuado com sucesso";
    private final CadastrarClientesRepo repo;

    public CadastrarUseCaseImpl(CadastrarClientesRepo repo){
        this.repo = repo;
    }

    @Override
    public String execute(String nome) {
        repo.cadastrar(nome.toLowerCase());
        return CADASTRO_EFETUADO_COM_SUCESSO;
    }
}
