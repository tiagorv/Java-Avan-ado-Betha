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
@Table(name = "pessoas")
public class Pessoas implements Serializable{
    
    @Id
    @Column(name = "pessoas_id")
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
    
    @Size(max = 2)
    @Column(name = "ddd")
    private String ddd;
    
    @Size(max = 10)
    @Column(name = "telefone")
    private String telefone;
    
    @Email
    @Size(max = 100)
    @Column(name = "email")
    private String email;
    
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
    
    @NotNull
    @Size(min = 1)
    @Column(name = "administrador")
    private String administrador;        
    
    @NotNull
    @Size(min = 3, max = 10)
    @Column(name = "senha")
    private String senha;    

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

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getAdministrador() {
        return administrador;
    }

    public void setAdministrador(String administrador) {
        this.administrador = administrador;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
