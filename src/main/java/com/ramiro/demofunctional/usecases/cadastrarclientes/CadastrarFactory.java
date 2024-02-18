package com.ramiro.demofunctional.usecases.cadastrarclientes;

import com.ramiro.demofunctional.repository.CadastrarClientesRepo;

public class CadastrarFactory {

    private static final String CADASTRO_EFETUADO_COM_SUCESSO = "Cadastro efetuado com sucesso";

    public static CadastrarUseCase create(CadastrarClientesRepo repo) {

        return nome -> {
            repo.cadastrar(nome.toLowerCase());
            return CADASTRO_EFETUADO_COM_SUCESSO;
        };
    }

}
