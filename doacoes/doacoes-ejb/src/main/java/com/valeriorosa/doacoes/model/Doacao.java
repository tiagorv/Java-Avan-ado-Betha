package com.valeriorosa.doacoes.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Doacao implements Serializable, Entidade {
    
    @Id
    @Column(name = "id_doacao")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "id_doador")
    private Doador doador;
    
    @Column(name = "mes")
    private String mes;
    
    @Column(name = "ano")
    private String ano;
    
    @ManyToOne
    @JoinColumn(name = "id_familia")
    private Familia familia;    
    
    @Column(name = "cesta_basica")
    private String cesta_basica;
    
    @Column(name = "leite")
    private String leite;
    
    @Column(name = "produto_limpeza")
    private String produto_limpeza;
    
    @Column(name = "brinquedo")
    private String brinquedo;
    
    @Column(name = "roupas")
    private String roupas;
    
    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Doador getDoador() {
        return doador;
    }

    public void setDoador(Doador doador) {
        this.doador = doador;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public Familia getFamilia() {
        return familia;
    }

    public void setFamilia(Familia familia) {
        this.familia = familia;
    }

    public String getCesta_basica() {
        return cesta_basica;
    }

    public void setCesta_basica(String cesta_basica) {
        this.cesta_basica = cesta_basica;
    }

    public String getLeite() {
        return leite;
    }

    public void setLeite(String leite) {
        this.leite = leite;
    }

    public String getProduto_limpeza() {
        return produto_limpeza;
    }

    public void setProduto_limpeza(String produto_limpeza) {
        this.produto_limpeza = produto_limpeza;
    }

    public String getBrinquedo() {
        return brinquedo;
    }

    public void setBrinquedo(String brinquedo) {
        this.brinquedo = brinquedo;
    }

    public String getRoupas() {
        return roupas;
    }

    public void setRoupas(String roupas) {
        this.roupas = roupas;
    }
}
