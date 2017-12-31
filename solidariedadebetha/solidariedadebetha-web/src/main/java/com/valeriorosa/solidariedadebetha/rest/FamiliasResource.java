package com.valeriorosa.solidariedadebetha.rest;

import com.valeriorosa.solidariedadebetha.model.Familias;
import com.valeriorosa.solidariedadebetha.service.AbstractCrudService;
import com.valeriorosa.solidariedadebetha.service.FamiliasService;
import javax.inject.Inject;
import javax.ws.rs.Path;

@Path("familias")
public class FamiliasResource extends AbstractCrudResource<Familias> {
    @Inject
    private FamiliasService service;

    @Override
    protected AbstractCrudService<Familias> getService() {
        return service;
    }
}