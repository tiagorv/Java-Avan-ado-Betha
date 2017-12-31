package com.valeriorosa.solidariedadebetha.service;

import com.valeriorosa.solidariedadebetha.model.Familias;
import com.valeriorosa.solidariedadebetha.util.GenericDao;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

@Stateless
@TransactionAttribute(TransactionAttributeType.SUPPORTS)
public class FamiliasService extends AbstractCrudService<Familias>{
    @Inject
    private GenericDao<Familias> dao;

    @Override
    protected GenericDao<Familias> getDao() {
        return dao;
    }    
}