package com.alura.acessible.services;

import com.alura.acessible.model.LocalAcessilidade;
import com.alura.acessible.repository.LocalAcessilidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LocalAcessilidadeService {

    @Autowired
    LocalAcessilidadeRepository classeRepository;

    public Page<LocalAcessilidade> listAll(Pageable paginacao){
        return classeRepository.findAll(paginacao);
    }

    public void save(LocalAcessilidade classe){
        classeRepository.save(classe);
    }

    public Optional<LocalAcessilidade> get(Long id){
        return classeRepository.findById(id);
    }

    public void deleteById(Long id) {
        classeRepository.deleteById(id);
    }
}