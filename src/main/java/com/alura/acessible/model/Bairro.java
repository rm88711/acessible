package com.alura.acessible.model;

import javax.persistence.*;

@Entity
@Table(name = "T_BAIRRO")
@SequenceGenerator(name = "seqBairro", sequenceName = "SQ_BAIRRO" , allocationSize = 1)
public class Bairro {
    @Id
    @Column(name = "ID_BAIRRO")
    @GeneratedValue(generator = "seqBairro",strategy = GenerationType.SEQUENCE)
    private Long idBairro;

    @Column(name = "ID_CIDADE" , length = 9)
    private Long idCidade;

    @Column(name = "NM_BAIRRO")
    private String nomeBairro;

    public Bairro() {
    }

    public Bairro(Long idCidade, String nomeBairro) {
        this.idCidade = idCidade;
        this.nomeBairro = nomeBairro;
    }

    public Long getIdBairro() {
        return idBairro;
    }

    public void setIdBairro(Long idBairro) {
        this.idBairro = idBairro;
    }

    public Long getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(Long idCidade) {
        this.idCidade = idCidade;
    }

    public String getNomeBairro() {
        return nomeBairro;
    }

    public void setNomeBairro(String nomeBairro) {
        this.nomeBairro = nomeBairro;
    }
}
