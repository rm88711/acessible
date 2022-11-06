package com.alura.acessible.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.alura.acessible.model.Estado;


public interface EstadoRepository extends JpaRepository<Estado, Long> {}