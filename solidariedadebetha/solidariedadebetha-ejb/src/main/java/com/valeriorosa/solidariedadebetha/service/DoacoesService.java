package com.valeriorosa.solidariedadebetha.service;

import com.valeriorosa.solidariedadebetha.model.Doacoes;
import com.valeriorosa.solidariedadebetha.util.DoacoesDao;
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
public class DoacoesService {
    
    @Inject
    private DoacoesDao dao;
    
    public List<Doacoes> findAll() {
        return dao.findAll();
    }
    
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public Doacoes insert(@Valid Doacoes doacao) {
        dao.insert(doacao);
        return doacao;
    }    
    
}
