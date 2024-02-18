package com.ramiro.demofunctional.config;

import com.ramiro.demofunctional.repository.CadastrarClientesRepo;
import com.ramiro.demofunctional.repository.ListarClientesRepo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashSet;
import java.util.Set;

@Configuration
public class AppConfig {

    /**
     * Exemplo de Closure.
     * A variável Set<String> DB faz parte da classe AppConfig
     * porém ela é usada (closure) na função lambda retornada palas funções abaixo:
     * - createCadastrarClienteRepo
     * - createListarClientesRepo
     */
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
