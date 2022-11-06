package com.alura.acessible.services;

import com.alura.acessible.model.Logradouro;
import com.alura.acessible.repository.LogradouroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LogradouroService {

    @Autowired
    LogradouroRepository classeRepository;

    public Page<Logradouro> listAll(Pageable paginacao){
        return classeRepository.findAll(paginacao);
    }

    public void save(Logradouro classe){
        classeRepository.save(classe);
    }

    public Optional<Logradouro> get(Long id){
        return classeRepository.findById(id);
    }

    public void deleteById(Long id) {
        classeRepository.deleteById(id);
    }
}
