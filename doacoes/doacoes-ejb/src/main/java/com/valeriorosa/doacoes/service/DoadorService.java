package com.valeriorosa.doacoes.service;

import com.valeriorosa.doacoes.model.Doador;
import com.valeriorosa.doacoes.util.GenericDao;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

@Stateless
@TransactionAttribute(TransactionAttributeType.SUPPORTS)
public class DoadorService extends AbstractCrudService<Doador> {
    @Inject
    private GenericDao<Doador> dao;

    @Override
    protected GenericDao<Doador> getDao() {
        return dao;
    }    
}