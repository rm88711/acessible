package com.alura.acessible.model;

import javax.persistence.*;

@Entity
@Table(name = "T_LOGRADOURO")
@SequenceGenerator(name = "seqlogra", sequenceName = "SQ_LOGRADOURO" , allocationSize = 1)
public class Logradouro {

    @Id
    @Column(name = "ID_LOGRADOURO")
    @GeneratedValue(generator = "seqlogra",strategy = GenerationType.SEQUENCE)
    private Long idLogradouro;

    @Column(name = "ID_CIDADE")
    private Long idCidade;

    @Column(name = "DS_LOGRADOURO", length = 90)
    private String Endereco;

    @Column(name = "NR_CEP", length = 20)
    private String cep;

    public Logradouro() {
    }

    public Logradouro(Long idCidade, String endereco, String cep) {
        this.idCidade = idCidade;
        Endereco = endereco;
        this.cep = cep;
    }

    public Long getIdLogradouro() {
        return idLogradouro;
    }

    public void setIdLogradouro(Long idLogradouro) {
        this.idLogradouro = idLogradouro;
    }

    public Long getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(Long idCidade) {
        this.idCidade = idCidade;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String endereco) {
        Endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
