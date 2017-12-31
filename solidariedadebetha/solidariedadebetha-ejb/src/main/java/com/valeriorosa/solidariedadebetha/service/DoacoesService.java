package com.valeriorosa.solidariedadebetha.service;

import com.valeriorosa.solidariedadebetha.model.Doacoes;
import com.valeriorosa.solidariedadebetha.util.GenericDao;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

@Stateless
@TransactionAttribute(TransactionAttributeType.SUPPORTS)
public class DoacoesService  extends AbstractCrudService<Doacoes>{
    @Inject
    private GenericDao<Doacoes> dao;

    @Override
    protected GenericDao<Doacoes> getDao() {
        return dao;
    }    
}