package com.ramiro.demofunctional.controller;

import com.ramiro.demofunctional.usecases.listarclientes.ListarUseCase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ListarClientesController {

    private final ListarUseCase useCase;

    @Autowired
    public ListarClientesController(ListarUseCase useCase) {
        this.useCase = useCase;
    }

    @GetMapping
    public List<String> listar(){
        return this.useCase.execute();
    }

}

