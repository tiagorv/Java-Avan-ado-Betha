package com.valeriorosa.solidariedadebetha.service;

import com.valeriorosa.solidariedadebetha.model.Familias;
import com.valeriorosa.solidariedadebetha.util.FamiliasDao;
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
public class FamiliasService {

    @Inject
    private FamiliasDao dao;
    
    public List<Familias> findAll() {
        return dao.findAll();
    }
    
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public Familias insert(@Valid Familias familia) {
        dao.insert(familia);
        return familia;
    }
}