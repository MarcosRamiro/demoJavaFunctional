package com.ramiro.demofunctional.config;

import com.ramiro.demofunctional.repository.CadastrarClientesRepo;
import com.ramiro.demofunctional.repository.ListarClientesRepo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashSet;
import java.util.Set;

@Configuration
public class AppConfig {

    private final Set<String> DB = new LinkedHashSet<>();

    @Bean
    public CadastrarClientesRepo createCadastrarClienteRepo(){
        return DB::add;
    }

    @Bean
    public ListarClientesRepo createListarClientesRepo(){
        return () -> DB.stream().toList();
    }
}
