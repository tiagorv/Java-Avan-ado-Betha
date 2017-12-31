package com.valeriorosa.solidariedadebetha.rest;

import com.valeriorosa.solidariedadebetha.model.Doadores;
import com.valeriorosa.solidariedadebetha.service.AbstractCrudService;
import com.valeriorosa.solidariedadebetha.service.DoadoresService;
import javax.inject.Inject;
import javax.ws.rs.Path;

@Path("doadores")
public class DoadoresResource extends AbstractCrudResource<Doadores> {

    @Inject
    private DoadoresService service;

    @Override
    protected AbstractCrudService<Doadores> getService() {
        return service;
    }
}