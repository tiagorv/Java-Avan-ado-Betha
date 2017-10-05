package com.valeriorosa.solidariedade.rest;

import com.valeriorosa.solidariedade.model.Doacoes;
import com.valeriorosa.solidariedade.service.DoacoesRepository;
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

@Path("doacoes")
public class DoacoesResource {
    
    @Inject
    private DoacoesRepository doacoesRepository;
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Doacoes> findAll(){
        return doacoesRepository.findAll();
    }
    
    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Doacoes findById(@PathParam("id") long id){
        return doacoesRepository.findById(id);
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response insert(Doacoes doacao){
        doacoesRepository.gravar(doacao);
        return Response.status(Response.Status.CREATED).entity(doacao).build();
    }
    
    @PUT
    @Path("{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response update(@PathParam("id") long id, Doacoes doacao) {
        doacoesRepository.update(doacao);
        return Response.ok(doacao).build();
    }
    
    @DELETE
    @Path("{id}")
    public Response delete(@PathParam("id") long id) {
        doacoesRepository.remove(id);
        return Response.noContent().build();
    }            
    
}
