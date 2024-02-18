package com.ramiro.demofunctional.usecases.listarclientes;

import com.ramiro.demofunctional.repository.ListarClientesRepo;


public class ListarFactory {
    public static ListarUseCase create(ListarClientesRepo repo) {
        return repo::toList;
    }
}
