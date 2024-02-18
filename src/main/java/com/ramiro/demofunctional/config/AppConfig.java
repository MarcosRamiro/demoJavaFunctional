package com.ramiro.demofunctional.config;

import com.ramiro.demofunctional.repository.CadastrarClientesRepo;
import com.ramiro.demofunctional.repository.ListarClientesRepo;
import com.ramiro.demofunctional.usecases.cadastrarclientes.CadastrarFactory;
import com.ramiro.demofunctional.usecases.cadastrarclientes.CadastrarUseCase;
import com.ramiro.demofunctional.usecases.listarclientes.ListarFactory;
import com.ramiro.demofunctional.usecases.listarclientes.ListarUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashSet;
import java.util.Set;

@Configuration
public class AppConfig {

    private final Set<String> DB = new LinkedHashSet<>();

    @Bean
    public CadastrarUseCase cadastrarCliente(){
        return CadastrarFactory.create(createCadastrarClienteRepo());
    }

    @Bean
    public ListarUseCase listarClientes(){
        return ListarFactory.create(createListarClientesRepo());
    }

    private CadastrarClientesRepo createCadastrarClienteRepo(){
        return DB::add;
    }

    private ListarClientesRepo createListarClientesRepo(){
        return () -> DB.stream().toList();
    }
}
