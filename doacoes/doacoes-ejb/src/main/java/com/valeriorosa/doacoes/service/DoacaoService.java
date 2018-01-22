package com.valeriorosa.doacoes.service;

import com.valeriorosa.doacoes.model.Doacao;
import com.valeriorosa.doacoes.util.GenericDao;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

@Stateless
@TransactionAttribute(TransactionAttributeType.SUPPORTS)
public class DoacaoService extends AbstractCrudService<Doacao> {
    
    @Inject
    private GenericDao<Doacao> dao;

    @Override
    protected GenericDao<Doacao> getDao() {
        return dao;
    }        
    
}
