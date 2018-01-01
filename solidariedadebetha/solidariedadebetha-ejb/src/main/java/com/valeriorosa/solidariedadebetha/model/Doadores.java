/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.valeriorosa.solidariedadebetha.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.Email;

/**
 *
 * @author tiagorv
 */
@Entity
@Table(name = "doadores")
public class Doadores implements Serializable, Entidade{
    
    @Id
    @Column(name = "id_doadores")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Size(min = 5, max = 100)
    @Column(name = "nome")
    private String nome;
    
    @NotNull
    @Pattern(regexp = "([0-9]{3}\\.[0-9]{3}\\.[0-9]{3}-[0-9]{2})|[0-9]{2}\\.[0-9]{3}\\.[0-9]{3}/[0-9]{4}-[0-9]{2}",
    message = "Deve corresponder a um CPF ou CNPJ formatado (ex.: 123.456.789-01)")
    @Column(name = "nr_documento", nullable = false, unique = true)    
    private String documento;
    
    @Size(max = 20)
    @Column(name = "rg")
    private String rg;    
    
    @Size(max = 2)
    @Column(name = "ddd_tel")
    private String ddd_tel;
    
    @Size(max = 10)
    @Column(name = "telefone")
    private String telefone;
    
    @Size(max = 2)
    @Column(name = "ddd_cel")
    private String ddd_cel;
    
    @Size(max = 10)
    @Column(name = "celular")
    private String celular;
    
    @Email
    @Size(max = 100)
    @Column(name = "email")
    private String email;
    
    @Column(name = "cep")
    private String cep;    
    
    @Column(name = "rua")
    private String rua;
    
    @Column(name = "numero")
    private String numero;
    
    @Column(name = "complemento")
    private String complemento;
    
    @Column(name = "bairro")
    private String bairro;
    
    @Column(name = "cidade")
    private String cidade;
    
    @Size(max = 2)
    @Column(name = "estado")
    private String estado;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
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

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}