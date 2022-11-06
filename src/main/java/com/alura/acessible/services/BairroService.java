package com.alura.acessible.services;

import com.alura.acessible.model.Bairro;
import com.alura.acessible.repository.BairroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BairroService {

    @Autowired
    BairroRepository classeRepository;

    public Page<Bairro> listAll(Pageable paginacao){
        return classeRepository.findAll(paginacao);
    }

    public void save(Bairro classe){
        classeRepository.save(classe);
    }

    public Optional<Bairro> get(Long id){
        return classeRepository.findById(id);
    }

    public void deleteById(Long id) {
        classeRepository.deleteById(id);
    }
}
