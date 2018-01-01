package com.valeriorosa.solidariedadebetha.model;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ConstraintMode;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author tiagorv
 */
@Entity
@Table(name = "doacoes")
public class Doacoes implements Serializable, Entidade{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    @Column(name = "doacoes_id")
    private Long id;
    
/*    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "id_doadores", nullable = false, 
            foreignKey = @ForeignKey(name = "fk_doacoes_pessoas", value = ConstraintMode.CONSTRAINT))
    private Doadores id_doadores;
    
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "id_familias", nullable = false, 
            foreignKey = @ForeignKey(name = "fk_doacoes_familias", value = ConstraintMode.CONSTRAINT))
    private Familias id_familias;*/
    
    @NotNull(message = "O mês da doação deve ser informado!")
    @Column(name = "mes")
    private int mes;        
    
    @NotNull(message = "O ano da doação deve ser informado!")
    @Column(name = "ano")
    private int ano;    
    
    @Column(name = "cesta_basica")
    @Enumerated(EnumType.STRING)
    private SimNao cestaBasica;    
    
    @Column(name = "produto_limpeza")
    @Enumerated(EnumType.STRING)
    private SimNao produto_limpeza;
    
    @Column(name = "roupas")
    @Enumerated(EnumType.STRING)
    private SimNao roupas;
    
    @Column(name = "brinquedos")
    @Enumerated(EnumType.STRING)
    private SimNao brinquedos;    
    
    @Column(name = "situacao")
    @Enumerated(EnumType.STRING)
    private Situacao situacao;    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

/*    public Doadores getId_doadores() {
        return id_doadores;
    }

    public void setId_doadores(Doadores id_doadores) {
        this.id_doadores = id_doadores;
    }

    public Familias getId_familias() {
        return id_familias;
    }

    public void setId_familias(Familias id_familias) {
        this.id_familias = id_familias;
    }
*/
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

    public SimNao getCestaBasica() {
        return cestaBasica;
    }

    public void setCestaBasica(SimNao cestaBasica) {
        this.cestaBasica = cestaBasica;
    }

    public SimNao getProduto_limpeza() {
        return produto_limpeza;
    }

    public void setProduto_limpeza(SimNao produto_limpeza) {
        this.produto_limpeza = produto_limpeza;
    }

    public SimNao getRoupas() {
        return roupas;
    }

    public void setRoupas(SimNao roupas) {
        this.roupas = roupas;
    }

    public SimNao getBrinquedos() {
        return brinquedos;
    }

    public void setBrinquedos(SimNao brinquedos) {
        this.brinquedos = brinquedos;
    }

    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }
}