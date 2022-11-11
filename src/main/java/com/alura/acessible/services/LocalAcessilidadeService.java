package com.alura.acessible.services;

import com.alura.acessible.model.LocalAcessilidade;
import com.alura.acessible.repository.LocalAcessilidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class LocalAcessilidadeService {

    @Autowired
    LocalAcessilidadeRepository classeRepository;

    public Page<LocalAcessilidade> listAll(Pageable paginacao){
        return classeRepository.findAll(paginacao);
    }

    public List<LocalAcessilidade> listAll(){

        return classeRepository.findAll();
    }

    public List<LocalAcessilidade> listTips(String tipo){
        List<LocalAcessilidade> locais = classeRepository.findAll();
        List<LocalAcessilidade> locaiss = new ArrayList<LocalAcessilidade>();
        for (LocalAcessilidade x : locais) {
            Long y = Long.valueOf(0);

            String valor = x.getTipo();
            if (valor.equals(tipo)){
//
                LocalAcessilidade lla = new LocalAcessilidade(   y       ,x.getIdLocal(),x.getLocal() ,x.getLogradouro() ,x.getCep() ,x.getBairro()  , x.getCidade(), x.getSigla(),x.getEstado(),x.getTipo(),x.getTpAcessibilidade());
                locaiss.add(lla);
                //System.out.println("REMOVIDO "+x.getIdLocal()+" TIPO "+x.getTipo());
                y = y +1;
            }

        }
        return locaiss;
    }
    public Optional<LocalAcessilidade> listTipos(String tipo){

        return classeRepository.findByTipo(tipo);
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