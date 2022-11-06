package com.alura.acessible.model;

import javax.persistence.*;

@Entity
@Table(name = "T_CIDADE")
@SequenceGenerator(name = "seqCidade", sequenceName = "SQ_CIDADE" , allocationSize = 1)
public class Cidade {
    @Id
    @Column(name = "ID_CIDADE")
    @GeneratedValue(generator = "seqCidade",strategy = GenerationType.SEQUENCE)
    private Long idCidade;

    @Column(name = "ID_ESTADO", length = 9)
    private Long idEstado;

    @Column(name = "NM_CIDADE", length = 9)
    private String nomeCidade;

    public Cidade() {
    }

    public Cidade(Long idEstado, String nomeCidade) {
        this.idEstado = idEstado;
        this.nomeCidade = nomeCidade;
    }

    public Long getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(Long idCidade) {
        this.idCidade = idCidade;
    }

    public Long getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Long idEstado) {
        this.idEstado = idEstado;
    }

    public String getNomeCidade() {
        return nomeCidade;
    }

    public void setNomeCidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }
}
