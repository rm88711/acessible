package com.alura.acessible.services;

import com.alura.acessible.model.Local;
import com.alura.acessible.repository.LocalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LocalService {

    @Autowired
    LocalRepository classeRepository;

    public Page<Local> listAll(Pageable paginacao){
        return classeRepository.findAll(paginacao);
    }

    public void save(Local classe){
        classeRepository.save(classe);
    }

    public Optional<Local> get(Long id){
        return classeRepository.findById(id);
    }

    public void deleteById(Long id) {
        classeRepository.deleteById(id);
    }
}

