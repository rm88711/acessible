package com.alura.acessible.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "T_ACESSIBILIDADE")
@SequenceGenerator(name = "seqAcess", sequenceName = "SQ_ACESSIBILIDADE" , allocationSize = 1)
public class Acessibilidade {

    @Id
    @Column(name = "ID_ACESSIBILIDADE")
    @GeneratedValue(generator = "seqAcess",strategy = GenerationType.SEQUENCE)
    private Long idAcess;

    @Column(name = "TP_ACESSIBILIDADE", length = 90)
    private String tpAcessibilidade;

    public Acessibilidade() {
    }

    public Acessibilidade(String tpAcessibilidade) {
        this.tpAcessibilidade = tpAcessibilidade;
    }

    public Long getIdAcess() {
        return idAcess;
    }

    public void setIdAcess(Long idAcess) {
        this.idAcess = idAcess;
    }

    public String getTpAcessibilidade() {
        return tpAcessibilidade;
    }

    public void setTpAcessibilidade(String tpAcessibilidade) {
        this.tpAcessibilidade = tpAcessibilidade;
    }
}
