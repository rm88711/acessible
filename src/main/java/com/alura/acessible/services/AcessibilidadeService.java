package com.alura.acessible.services;

import com.alura.acessible.model.Acessibilidade;
import com.alura.acessible.repository.AcessibilidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AcessibilidadeService {

    @Autowired
    AcessibilidadeRepository classeRepository;

    public Page<Acessibilidade> listAll(Pageable paginacao){
        return classeRepository.findAll(paginacao);
    }

    public void save(Acessibilidade classe){
        classeRepository.save(classe);
    }

    public Optional<Acessibilidade> get(Long id){
        return classeRepository.findById(id);
    }

    public void deleteById(Long id) {
        classeRepository.deleteById(id);
    }
}

