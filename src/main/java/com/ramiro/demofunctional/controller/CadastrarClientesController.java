package com.ramiro.demofunctional.controller;

import com.ramiro.demofunctional.controller.dto.RequestCadastro;
import com.ramiro.demofunctional.usecases.cadastrarclientes.CadastrarUseCase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class CadastrarClientesController {

    private final CadastrarUseCase useCase;

    @Autowired
    public CadastrarClientesController(CadastrarUseCase useCase) {
        this.useCase = useCase;
    }

    @PostMapping
    public String cadastrar(@RequestBody RequestCadastro req){
        return this.useCase.execute(req.nome());
    }
}

