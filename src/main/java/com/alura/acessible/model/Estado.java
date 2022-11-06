package com.alura.acessible.model;


import javax.persistence.*;

@Entity
@Table(name = "T_ESTADO")
@SequenceGenerator(name = "seqEstado", sequenceName = "SQ_ESTADO" , allocationSize = 1)
public class Estado {

    @Id
    @Column(name = "ID_ESTADO", length = 9)
    @GeneratedValue(generator = "seqEstado",strategy = GenerationType.SEQUENCE)
    private Long idEstado;

    @Column(name = "NM_ESTADO",length = 30)
    private String nomeEstado;

    @Column(name = "NM_SIGLA_ESTADO",length = 2)
    private String siglaEstado;

    public Estado() {
    }

    public Estado(String nomeEstado, String siglaEstado) {
        this.nomeEstado = nomeEstado;
        this.siglaEstado = siglaEstado;
    }

    public Long getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Long idEstado) {
        this.idEstado = idEstado;
    }

    public String getNomeEstado() {
        return nomeEstado;
    }

    public void setNomeEstado(String nomeEstado) {
        this.nomeEstado = nomeEstado;
    }

    public String getSiglaEstado() {
        return siglaEstado;
    }

    public void setSiglaEstado(String siglaEstado) {
        this.siglaEstado = siglaEstado;
    }

    @Override
    public String toString() {
        return "ALUNOS [idEstado = "+idEstado+" ,Nome = "+nomeEstado+" ,siglaEstado = "+siglaEstado+"   ]";
    }
}
