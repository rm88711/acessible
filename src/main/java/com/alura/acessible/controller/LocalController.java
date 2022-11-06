package com.alura.acessible.controller;

import com.alura.acessible.model.Local;
import com.alura.acessible.services.LocalService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("/api/local")
public class LocalController {

    @Autowired
    private LocalService service;

    @GetMapping
    public Page<Local> index(@PageableDefault(size=50) Pageable paginacao){
        return service.listAll(paginacao);
    }

    @PostMapping
    public ResponseEntity<Local> create(@RequestBody @Valid Local classe){
        service.save(classe);
        return ResponseEntity.status(HttpStatus.CREATED).body(classe);
    }

    @GetMapping("{id}")
    public ResponseEntity<Local> show(@PathVariable Long id){
        return ResponseEntity.of(service.get(id));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Object> destroy(@PathVariable Long id){
        Optional<Local> optional = service.get(id);

        if(optional.isEmpty())
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

        service.deleteById(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @PutMapping("{id}")
    public ResponseEntity<Local> update(@PathVariable Long id, @RequestBody @Valid Local newLocal){
        // carregar a tarefa do banco
        Optional<Local> optional = service.get(id);

        // verificar se existe a tarefa com esse id
        if(optional.isEmpty())
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

        // atualizar os dados
        Local classe = optional.get();
        BeanUtils.copyProperties(newLocal, classe);
        classe.setIdLocal(id);

        // salvar a tarefa
        service.save(classe);

        return ResponseEntity.ok(classe);

    }

}