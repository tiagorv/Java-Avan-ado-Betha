package com.valeriorosa.solidariedade.rest;

import com.valeriorosa.solidariedade.model.Familias;
import com.valeriorosa.solidariedade.service.FamiliasRepository;
import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("familias")
public class FamiliasResource {
    
    @Inject
    private FamiliasRepository familiasRepository;
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Familias> findAll(){
        return familiasRepository.findAll();
    }
    
    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Familias findById(@PathParam("id") long id){
        return familiasRepository.findById(id);
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response insert(Familias familia){
        familiasRepository.gravar(familia);
        return Response.status(Response.Status.CREATED).entity(familia).build();
    }
    
    @PUT
    @Path("{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response update(@PathParam("id") long id, Familias familia) {
        familiasRepository.update(familia);
        return Response.ok(familia).build();
    }
    
    @DELETE
    @Path("{id}")
    public Response delete(@PathParam("id") long id) {
        familiasRepository.remove(id);
        return Response.noContent().build();
    }        
}
