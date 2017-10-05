package com.valeriorosa.solidariedade.service;

import com.valeriorosa.solidariedade.model.Doacoes;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

@Stateless
public class DoacoesRepository {
    
    @Inject
    private EntityManager entityManager;
    
    public List<Doacoes> findAll() {
        return entityManager.createQuery(
                "SELECT d FROM Doacoes d ORDER BY d.ano, d.mes", 
                Doacoes.class).getResultList();
    }
    
    public Doacoes findById(long id) {
        return entityManager.find(Doacoes.class, id);
    }

    public void gravar(Doacoes doacao) {
        entityManager.persist(doacao);
    }

    public void update(Doacoes doacao) {
        entityManager.merge(doacao);
    }
    
    public void remove(long id) {
        Doacoes doacao = entityManager.getReference(Doacoes.class, id);
        entityManager.remove(doacao);
    }    
}
