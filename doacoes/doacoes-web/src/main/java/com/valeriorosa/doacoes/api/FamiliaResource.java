package com.valeriorosa.doacoes.api;

import com.valeriorosa.doacoes.model.Familia;
import com.valeriorosa.doacoes.service.AbstractCrudService;
import com.valeriorosa.doacoes.service.FamiliaService;
import javax.inject.Inject;
import javax.ws.rs.Path;

@Path("familias")
public class FamiliaResource extends AbstractCrudResource<Familia> {

    @Inject
    private FamiliaService service;

    @Override
    protected AbstractCrudService<Familia> getService() {
        return service;
    }    
}