package com.valeriorosa.solidariedade.rest;

import com.valeriorosa.solidariedade.model.Pessoas;
import com.valeriorosa.solidariedade.service.PessoasRepository;
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

@Path("pessoas")
public class PessoasResource {
    
    @Inject
    private PessoasRepository pessoasRepository;
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Pessoas> findAll(){
        return pessoasRepository.findAll();
    }
    
    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Pessoas findById(@PathParam("id") long id){
        return pessoasRepository.findById(id);
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response insert(Pessoas pessoa){
        pessoasRepository.gravar(pessoa);
        return Response.status(Response.Status.CREATED).entity(pessoa).build();
    }
    
    @PUT
    @Path("{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response update(@PathParam("id") long id, Pessoas pessoa) {
        pessoasRepository.update(pessoa);
        return Response.ok(pessoa).build();
    }
    
    @DELETE
    @Path("{id}")
    public Response delete(@PathParam("id") long id) {
        pessoasRepository.remove(id);
        return Response.noContent().build();
    }    
}
