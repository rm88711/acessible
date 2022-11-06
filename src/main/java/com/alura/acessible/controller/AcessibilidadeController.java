package com.alura.acessible.controller;


import com.alura.acessible.model.Acessibilidade;
import com.alura.acessible.services.AcessibilidadeService;
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
@RequestMapping("/api/acessibilidade")
public class AcessibilidadeController {

    @Autowired
    private AcessibilidadeService service;

    @GetMapping
    public Page<Acessibilidade> index(@PageableDefault(size=50) Pageable paginacao){
        return service.listAll(paginacao);
    }

    @PostMapping
    public ResponseEntity<Acessibilidade> create(@RequestBody @Valid Acessibilidade classe){
        service.save(classe);
        return ResponseEntity.status(HttpStatus.CREATED).body(classe);
    }

    @GetMapping("{id}")
    public ResponseEntity<Acessibilidade> show(@PathVariable Long id){
        return ResponseEntity.of(service.get(id));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Object> destroy(@PathVariable Long id){
        Optional<Acessibilidade> optional = service.get(id);

        if(optional.isEmpty())
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

        service.deleteById(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @PutMapping("{id}")
    public ResponseEntity<Acessibilidade> update(@PathVariable Long id, @RequestBody @Valid Acessibilidade newAcessibilidade){
        // carregar a tarefa do banco
        Optional<Acessibilidade> optional = service.get(id);

        // verificar se existe a tarefa com esse id
        if(optional.isEmpty())
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

        // atualizar os dados
        Acessibilidade classe = optional.get();
        BeanUtils.copyProperties(newAcessibilidade, classe);
        classe.setIdAcess(id);

        // salvar a tarefa
        service.save(classe);

        return ResponseEntity.ok(classe);

    }

}

