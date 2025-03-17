package com.example.Spring.config;
import com.example.Spring.model.Pessoa;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
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
}