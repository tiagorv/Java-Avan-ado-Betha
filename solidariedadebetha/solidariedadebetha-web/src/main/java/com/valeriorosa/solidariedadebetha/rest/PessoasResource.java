package com.valeriorosa.solidariedadebetha.rest;

import com.valeriorosa.solidariedadebetha.model.Pessoas;
import com.valeriorosa.solidariedadebetha.service.PessoasService;
import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author tiagorv
 */
@Path("pessoas")
public class PessoasResource {

    @Inject
    private PessoasService service;
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Pessoas> findAll() {
        return service.findAll();
    }
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response insert(Pessoas pessoa) {
        return Response.status(Response.Status.CREATED)
                .entity(service.insert(pessoa)).build();
    }
    
}
