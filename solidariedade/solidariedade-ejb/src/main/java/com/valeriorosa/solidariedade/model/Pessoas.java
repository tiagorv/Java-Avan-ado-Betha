package com.valeriorosa.solidariedade.model;

import com.valeriorosa.solidariedade.util.Cpf;
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
@Table(name = "pessoas")
public class Pessoas implements Serializable{
    //private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pessoa_id")
    private Long id;
    
    @NotNull(message = "O tipo da pessoa deve ser informado!")
    @Column(name = "tipo")
    private String tipo;
    
    @Cpf
    @Column(name = "cpf")
    private String cpf;    
    
    @Column(name = "cnpj")
    private String cnpj;    
    
    @NotNull(message = "O nome da pessoa deve ser informado!")
    @Column(name = "nome")
    private String nome;
    
    @Column(name = "ddd")    
    private String ddd;
    
    @Column(name = "telefone")    
    private String telefone;
    
    @Email(message = "E-mail da pessoa inválido!")
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
    
    @Column(name = "uf")
    private String uf;
    
    @Column(name = "usuario")
    private String usuario;

    @Column(name = "senha")
    private String senha;
    
    @Column(name = "admin")
    private String admin;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }
}