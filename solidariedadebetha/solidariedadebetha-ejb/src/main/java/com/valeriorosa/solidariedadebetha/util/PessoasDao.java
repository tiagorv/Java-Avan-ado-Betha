package com.valeriorosa.solidariedadebetha.util;

import com.valeriorosa.solidariedadebetha.model.Pessoas;
import java.util.List;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.validation.Valid;

/**
 *
 * @author tiagorv
 */
public class PessoasDao {
    @Inject
    private EntityManager em;
    
    public List<Pessoas> findAll() {
        return em.createQuery("SELECT p FROM Pessoas p").getResultList();
    }
    
    public Pessoas findById(long id) {
        return em.find(Pessoas.class, id);
    }
    
    public void insert(@Valid Pessoas pessoa) {
        em.persist(pessoa);
    }        
}