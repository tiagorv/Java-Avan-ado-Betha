package com.valeriorosa.solidariedadebetha.rest;

import com.valeriorosa.solidariedadebetha.model.Familias;
import com.valeriorosa.solidariedadebetha.service.FamiliasService;
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
@Path("familias")
public class FamiliasResource {
    
    @Inject
    private FamiliasService service;
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Familias> findAll() {
        return service.findAll();
    }
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response insert(Familias familia) {
        return Response.status(Response.Status.CREATED)
                .entity(service.insert(familia)).build();
    }    
}