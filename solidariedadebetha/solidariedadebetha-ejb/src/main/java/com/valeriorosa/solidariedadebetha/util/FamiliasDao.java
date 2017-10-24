package com.valeriorosa.solidariedadebetha.util;

import com.valeriorosa.solidariedadebetha.model.Familias;
import java.util.List;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.validation.Valid;

/**
 *
 * @author tiagorv
 */
public class FamiliasDao {
    @Inject
    private EntityManager em;
    
    public List<Familias> findAll() {
        return em.createQuery("SELECT f FROM Familias f").getResultList();
    }
    
    public Familias findById(long id) {
        return em.find(Familias.class, id);
    }
    
    public void insert(@Valid Familias familia) {
        em.persist(familia);
    }            
}