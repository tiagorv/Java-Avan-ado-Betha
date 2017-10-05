package com.valeriorosa.solidariedade.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "doacoes")
public class Doacoes implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    @Column(name = "id")
    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "pessoa_id")
    private Pessoas pessoa;
    
    @ManyToOne
    @JoinColumn(name = "familia_id")
    private Familias familia;
    
    @NotNull
    @Column(name = "mes")
    private int mes;        
    
    @NotNull
    @Column(name = "ano")
    private int ano;    
    
    @Column(name = "cesta_basica")
    private String cestaBasica;    
    
    @Column(name = "higiene")
    private String higiene;
    
    @Column(name = "leite")
    private String leite;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCestaBasica() {
        return cestaBasica;
    }

    public void setCestaBasica(String cestaBasica) {
        this.cestaBasica = cestaBasica;
    }

    public String getHigiene() {
        return higiene;
    }

    public void setHigiene(String higiene) {
        this.higiene = higiene;
    }

    public String getLeite() {
        return leite;
    }

    public void setLeite(String leite) {
        this.leite = leite;
    }

    public Pessoas getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoas pessoa) {
        this.pessoa = pessoa;
    }

    public Familias getFamilia() {
        return familia;
    }

    public void setFamilia(Familias familia) {
        this.familia = familia;
    }
    
}
