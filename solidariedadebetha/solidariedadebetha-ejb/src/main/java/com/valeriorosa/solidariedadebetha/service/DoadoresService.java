package com.valeriorosa.solidariedadebetha.service;

import com.valeriorosa.solidariedadebetha.model.Doadores;
import com.valeriorosa.solidariedadebetha.util.GenericDao;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

@Stateless
@TransactionAttribute(TransactionAttributeType.SUPPORTS)
public class DoadoresService extends AbstractCrudService<Doadores>{
    @Inject
    private GenericDao<Doadores> dao;

    @Override
    protected GenericDao<Doadores> getDao() {
        return dao;
    }    
}