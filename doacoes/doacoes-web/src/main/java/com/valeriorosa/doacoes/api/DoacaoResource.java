package com.valeriorosa.doacoes.api;

import com.valeriorosa.doacoes.model.Doacao;
import com.valeriorosa.doacoes.service.AbstractCrudService;
import com.valeriorosa.doacoes.service.DoacaoService;
import javax.inject.Inject;
import javax.ws.rs.Path;

@Path("doacoes")
public class DoacaoResource extends AbstractCrudResource<Doacao> {

    @Inject
    private DoacaoService service;

    @Override
    protected AbstractCrudService<Doacao> getService() {
        return service;
    }
}