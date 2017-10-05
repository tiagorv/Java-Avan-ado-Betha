package com.valeriorosa.solidariedade.service;

import com.valeriorosa.solidariedade.model.Pessoas;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

@Stateless
public class PessoasRepository{

    @Inject
    private EntityManager entityManager;
    
    public List<Pessoas> findAll() {
        return entityManager.createQuery(
                "SELECT p FROM Pessoas p ORDER BY p.nome", 
                Pessoas.class).getResultList();
    }
    
    public Pessoas findById(long id) {
        return entityManager.find(Pessoas.class, id);
    }

    public void gravar(Pessoas pessoa) {
        entityManager.persist(pessoa);
    }

    public void update(Pessoas pessoa) {
        entityManager.merge(pessoa);
    }
    
    public void remove(long id) {
        Pessoas pessoa = entityManager.getReference(Pessoas.class, id);
        entityManager.remove(pessoa);
    }
}