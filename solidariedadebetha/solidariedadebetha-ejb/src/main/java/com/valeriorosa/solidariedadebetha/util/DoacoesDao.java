package com.valeriorosa.solidariedadebetha.util;

import com.valeriorosa.solidariedadebetha.model.Doacoes;
import java.util.List;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.validation.Valid;

/**
 *
 * @author tiagorv
 */
public class DoacoesDao {
    
    @Inject
    private EntityManager em;
    
    public List<Doacoes> findAll() {
        return em.createQuery("SELECT d FROM Doacoes d").getResultList();
    }
    
    public Doacoes findById(long id) {
        return em.find(Doacoes.class, id);
    }
    
    public void insert(@Valid Doacoes doacao) {
        em.persist(doacao);
    }                   
}