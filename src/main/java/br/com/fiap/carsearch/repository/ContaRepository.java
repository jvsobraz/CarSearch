package br.com.fiap.carsearch.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.carsearch.models.Conta;

public interface ContaRepository extends JpaRepository<Conta, Long> {
    
}