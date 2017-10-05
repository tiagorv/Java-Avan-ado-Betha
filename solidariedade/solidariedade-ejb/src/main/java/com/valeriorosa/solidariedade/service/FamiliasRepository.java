package com.valeriorosa.solidariedade.service;

import com.valeriorosa.solidariedade.model.Familias;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

@Stateless
public class FamiliasRepository {
    
    @Inject
    private EntityManager entityManager;
    
    public List<Familias> findAll() {
        return entityManager.createQuery(
                "SELECT f FROM Familias f ORDER BY f.descricao", 
                Familias.class).getResultList();
    }
    
    public Familias findById(long id) {
        return entityManager.find(Familias.class, id);
    }

    public void gravar(Familias familia) {
        entityManager.persist(familia);
    }

    public void update(Familias familia) {
        entityManager.merge(familia);
    }
    
    public void remove(long id) {
        Familias familia = entityManager.getReference(Familias.class, id);
        entityManager.remove(familia);
    }    
    
}
