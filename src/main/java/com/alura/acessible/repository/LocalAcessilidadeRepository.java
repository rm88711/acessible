package com.alura.acessible.repository;

import com.alura.acessible.model.LocalAcessilidade;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LocalAcessilidadeRepository extends JpaRepository<LocalAcessilidade, Long> {
    Optional<LocalAcessilidade> findByTipo(String tipo);
}
