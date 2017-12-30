package com.valeriorosa.solidariedadebetha.util;

import com.valeriorosa.solidariedadebetha.model.Doadores;
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
    
    public List<Doadores> findAll() {
        return em.createQuery("SELECT p FROM Pessoas p").getResultList();
    }
    
    public Doadores findById(long id) {
        return em.find(Doadores.class, id);
    }
    
    public void insert(@Valid Doadores pessoa) {
        em.persist(pessoa);
    }        
}