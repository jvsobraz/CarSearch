package br.com.fiap.carsearch.config;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.fiap.carsearch.models.Conta;
import br.com.fiap.carsearch.models.Despesa;
import br.com.fiap.carsearch.models.Usuario;
import br.com.fiap.carsearch.repository.ContaRepository;
import br.com.fiap.carsearch.repository.DespesaRepository;
import br.com.fiap.carsearch.repository.UsuarioRepository;

@Configuration
@Profile("dev")
public class DatabaseSeeder implements CommandLineRunner {

    @Autowired
    ContaRepository contaRepository;

    @Autowired
    DespesaRepository despesaRepository;

    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public void run(String... args) throws Exception {
        Conta c1 = new Conta(1L, "Itaú", new BigDecimal(100), "money", true);
        Conta c2 = new Conta(2L, "Banco do Brasil", new BigDecimal(56), "money", true);
        Conta c3 = new Conta(3L, "Wallet", new BigDecimal(3), "coin", true);
        contaRepository.saveAll(List.of(c1,c2,c3));

        despesaRepository.saveAll(List.of(
            Despesa.builder().valor(new BigDecimal(54)).descricao("aluguel").data(LocalDate.now()).conta(c1).build(),
            Despesa.builder().valor(new BigDecimal(12)).descricao("estacionamento").data(LocalDate.now()).conta(c1).build(),
            Despesa.builder().valor(new BigDecimal(54)).descricao("imposto").data(LocalDate.now()).conta(c1).build(),
            Despesa.builder().valor(new BigDecimal(78)).descricao("tarifa").data(LocalDate.now()).conta(c1).build()
        ));

        usuarioRepository.save(Usuario.builder()
            .nome("João Vitor")
            .email("jvsobraz@hotmail.com")
            .senha("$2a$12$pMH3uGhwRXAaEq21jmmqn.PzxykI/HJyVAXM6sIQlcQ/2emqevaWC")
            .build()
        );
       
    }
    
}