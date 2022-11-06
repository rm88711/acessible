package com.alura.acessible.services;

import com.alura.acessible.model.Cidade;
import com.alura.acessible.repository.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CidadeService {

    @Autowired
    CidadeRepository classeRepository;

    public Page<Cidade> listAll(Pageable paginacao){
        return classeRepository.findAll(paginacao);
    }

    public void save(Cidade classe){
        classeRepository.save(classe);
    }

    public Optional<Cidade> get(Long id){
        return classeRepository.findById(id);
    }

    public void deleteById(Long id) {
        classeRepository.deleteById(id);
    }
}