package com.valeriorosa.solidariedadebetha.rest;

import com.valeriorosa.solidariedadebetha.model.Doacoes;
import com.valeriorosa.solidariedadebetha.service.AbstractCrudService;
import com.valeriorosa.solidariedadebetha.service.DoacoesService;
import javax.inject.Inject;
import javax.ws.rs.Path;

@Path("doacoes")
public class DoacoesResource extends AbstractCrudResource<Doacoes> {
    @Inject
    private DoacoesService service;

    @Override
    protected AbstractCrudService<Doacoes> getService() {
        return service;
    }
}