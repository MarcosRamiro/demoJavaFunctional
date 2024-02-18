package com.ramiro.demofunctional.usecases.listarclientes;

import com.ramiro.demofunctional.repository.ListarClientesRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListaUseCaseImpl implements ListarUseCase {
    private final ListarClientesRepo repo;

    public ListaUseCaseImpl(ListarClientesRepo repo){
        this.repo = repo;
    }

    @Override
    public List<String> execute() {
        return repo.toList();
    }
}
