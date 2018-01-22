package com.valeriorosa.doacoes.service;

import com.valeriorosa.doacoes.model.Familia;
import com.valeriorosa.doacoes.util.GenericDao;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

@Stateless
@TransactionAttribute(TransactionAttributeType.SUPPORTS)
public class FamiliaService extends AbstractCrudService<Familia> {
    
    @Inject
    private GenericDao<Familia> dao;

    @Override
    protected GenericDao<Familia> getDao() {
        return dao;
    }        
}
