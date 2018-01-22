package com.valeriorosa.doacoes.api;

import com.valeriorosa.doacoes.model.Doador;
import com.valeriorosa.doacoes.service.AbstractCrudService;
import com.valeriorosa.doacoes.service.DoadorService;
import javax.inject.Inject;
import javax.ws.rs.Path;

@Path("doadores")
public class DoadorResource extends AbstractCrudResource<Doador> {

    @Inject
    private DoadorService service;

    @Override
    protected AbstractCrudService<Doador> getService() {
        return service;
    }
}