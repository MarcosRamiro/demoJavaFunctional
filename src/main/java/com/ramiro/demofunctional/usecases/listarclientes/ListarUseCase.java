package com.ramiro.demofunctional.usecases.listarclientes;

import java.util.List;

@FunctionalInterface
public interface ListarUseCase {
    List<String> listar();
}
