package com.alura.acessible.services;

import com.alura.acessible.model.Estado;
import com.alura.acessible.repository.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstadoService {

    @Autowired
    EstadoRepository classeRepository;

    public Page<Estado> listAll(Pageable paginacao){
        return classeRepository.findAll(paginacao);
    }

    public List<Estado> listAll(){

        return classeRepository.findAll();
    }
    public void save(Estado classe){
        classeRepository.save(classe);
    }

    public Optional<Estado> get(Long id){
        return classeRepository.findById(id);
    }

    public void deleteById(Long id) {
        classeRepository.deleteById(id);
    }
}