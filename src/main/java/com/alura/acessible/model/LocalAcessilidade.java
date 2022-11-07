package com.alura.acessible.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "T_LOCAIS")
@SequenceGenerator(name = "seqLocais", sequenceName = "SQ_LOCAIS" , allocationSize = 1)
public class LocalAcessilidade {
    @Id
    @Column(name = "ID_LOCAL")
    @GeneratedValue(generator = "seqLocais", strategy = GenerationType.SEQUENCE)
    private Long idLocal;

    @Column(name = "NM_LOCAL", length = 90)
    private String local;

    @Column(name = "DS_LOGRADOURO", length = 90)
    private String logradouro;

    @Column(name = "NR_CEP", length = 20)
    private String cep;

    @Column(name = "NM_BAIRRO", length = 90)
    private  String bairro;

    @Column(name = "NM_CIDADE", length = 80)
    private  String cidade;

    @Column(name = "NM_SIGLA_ESTADO", length = 2)
    private  String sigla;

    @Column(name = "NM_ESTADO", length = 30)
    private  String estado;

    public LocalAcessilidade() {
    }

    public LocalAcessilidade(String local, String logradouro, String cep, String bairro, String cidade, String sigla, String estado) {
        this.local = local;
        this.logradouro = logradouro;
        this.cep = cep;
        this.bairro = bairro;
        this.cidade = cidade;
        this.sigla = sigla;
        this.estado = estado;
    }

    public Long getIdLocal() {
        return idLocal;
    }

    public void setIdLocal(Long idLocal) {
        this.idLocal = idLocal;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
