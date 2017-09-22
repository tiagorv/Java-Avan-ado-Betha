/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.valeriorosa.solidariedade.service;

import com.valeriorosa.solidariedade.model.Cliente;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author tiagorv
 */
@ApplicationScoped
public class ClienteRepository {
    
    private List<Cliente> registros = new ArrayList<>();
    private long nextId = 0;

    public List<Cliente> findAll() {
        return registros;
    }
    
    public Cliente findById(long id) {
        for (int i = 0; i < registros.size(); i++) {
            if (registros.get(i).getId().equals(id)) {
                return registros.get(i);
            }
        }
        return null;
    }

    public void add(Cliente cli) {
        cli.setId(++nextId);
        registros.add(cli);
    }

    public void change(long id, Cliente cli) {
        for (int i = 0; i < registros.size(); i++) {
            if (registros.get(i).getId().equals(id)) {
                registros.set(i, cli);
                return;
            }
        }
    }
    
    public void remove(long id) {
        Cliente selecionado = null;
        for (int i = 0; i < registros.size(); i++) {
            if (registros.get(i).getId().equals(id)) {
                selecionado = registros.get(i);
                break;
            }
        }
        if (selecionado != null) {
            registros.remove(selecionado);
        }
    }

    public List<Cliente> findAll(int offset, int limit, String sort) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
