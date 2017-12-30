package com.valeriorosa.solidariedadebetha.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Email;

@Entity
@Table(name = "familias")
public class Familias implements Serializable, Entidade{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_familias")
    private Long id;
    
    @NotNull(message = "A descrição da família deve ser informada!")
    @Column(name = "descricao")
    private String descricao;
    
    @NotNull(message = "O responsável da família deve ser informado!")
    @Column(name = "responsavel")
    private String responsavel;    
    
    @Column(name = "criancas")
    private int criancas;
    
    @Column(name = "adultos")
    private int adultos;
    
    @Column(name = "ddd_tel")    
    private String ddd_tel;
    
    @Column(name = "telefone")    
    private String telefone;
    
    @Column(name = "ddd_cel")    
    private String ddd_cel;
    
    @Column(name = "celular")    
    private String celular;    
    
    @Email
    @Column(name = "email")
    private String email;
    
    @Column(name = "numero")
    private String numero;
    
    @Column(name = "cep")
    private String cep;
    
    @Column(name = "rua")
    private String rua;
    
    @Column(name = "bairro")
    private String bairro;
    
    @Column(name = "complemento")
    private String complemento;
    
    @Column(name = "cidade")
    private String cidade;
    
    @Column(name = "estado")
    private String estado;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public int getCriancas() {
        return criancas;
    }

    public void setCriancas(int criancas) {
        this.criancas = criancas;
    }

    public int getAdultos() {
        return adultos;
    }

    public void setAdultos(int adultos) {
        this.adultos = adultos;
    }

    public String getDdd_tel() {
        return ddd_tel;
    }

    public void setDdd_tel(String ddd_tel) {
        this.ddd_tel = ddd_tel;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDdd_cel() {
        return ddd_cel;
    }

    public void setDdd_cel(String ddd_cel) {
        this.ddd_cel = ddd_cel;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}