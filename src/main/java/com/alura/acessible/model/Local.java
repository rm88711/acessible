package com.alura.acessible.model;


import javax.persistence.*;

@Entity
@Table(name = "T_LOCAL")
@SequenceGenerator(name = "seqLocal", sequenceName = "SQ_LOCAL" , allocationSize = 1)
public class Local {

    @Id
    @Column(name = "ID_LOCAL")
    @GeneratedValue(generator = "seqLocal",strategy = GenerationType.SEQUENCE)
    private Long idLocal;

    @Column(name = "ID_LOGRADOURO")
    private Long idLogradouro;

    @Column(name = "NM_LOCAL", length = 90)
    private String nomeLocal;

    public Local() {
    }

    public Local(Long idLogradouro, String nomeLocal) {
        this.idLogradouro = idLogradouro;
        this.nomeLocal = nomeLocal;
    }

    public Long getIdLocal() {
        return idLocal;
    }

    public void setIdLocal(Long idLocal) {
        this.idLocal = idLocal;
    }

    public Long getIdLogradouro() {
        return idLogradouro;
    }

    public void setIdLogradouro(Long idLogradouro) {
        this.idLogradouro = idLogradouro;
    }

    public String getNomeLocal() {
        return nomeLocal;
    }

    public void setNomeLocal(String nomeLocal) {
        this.nomeLocal = nomeLocal;
    }
}
