package com.example.Spring.config;


import com.example.Spring.model.Pessoa;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PessoaConfig {

    @Bean
    public Pessoa pessoa(
            @Value("${pessoa.nome}") String nome,
            @Value("${pessoa.idade}") int idade,
            @Value("${pessoa.sexo}") String sexo,
            @Value("${pessoa.estadoCivil}") String estadoCivil,
            @Value("${pessoa.profissao}") String profissao) {
        return new Pessoa(nome, idade, sexo, estadoCivil, profissao);
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("Pessoa configurada:");
        System.out.println("Nome: " + System.getenv("PESSOA_NOME"));
        System.out.println("Idade: " + System.getenv("PESSOA_IDADE"));
        System.out.println("Sexo: " + System.getenv("PESSOA_SEXO"));
        System.out.println("Estado Civil: " + System.getenv("PESSOA_ESTADO_CIVIL"));
        System.out.println("Profissão: " + System.getenv("PESSOA_PROFISSAO"));
    }
}