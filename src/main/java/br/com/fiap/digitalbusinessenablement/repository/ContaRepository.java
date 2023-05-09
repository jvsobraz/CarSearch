package br.com.fiap.digitalbusinessenablement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.digitalbusinessenablement.models.Conta;

public interface ContaRepository extends JpaRepository<Conta, Long> {
    
}