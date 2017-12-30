package com.valeriorosa.solidariedadebetha.service;

import com.valeriorosa.solidariedadebetha.model.Doadores;
import com.valeriorosa.solidariedadebetha.util.PessoasDao;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;
import javax.validation.Valid;

/**
 *
 * @author tiagorv
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.SUPPORTS)
public class PessoasService {

    @Inject
    private PessoasDao dao;
    
    public List<Doadores> findAll() {
        return dao.findAll();
    }
    
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public Doadores insert(@Valid Doadores pessoa) {
        dao.insert(pessoa);
        return pessoa;
    }
}