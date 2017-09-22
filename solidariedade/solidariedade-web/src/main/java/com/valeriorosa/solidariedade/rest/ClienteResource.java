/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.valeriorosa.solidariedade.rest;

import com.valeriorosa.solidariedade.model.Cliente;
import com.valeriorosa.solidariedade.service.ClienteRepository;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

/**
 *
 * @author tiagorv
 */
@Path("clientes")
public class ClienteResource {
    
    @Inject
    private ClienteRepository repository;
    @Context 
    private UriInfo uriInfo;
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Cliente> findAll(@DefaultValue("50") @QueryParam("limit") Long limit, 
                                 @DefaultValue("0") @QueryParam("offset") Long offset, 
                                 @DefaultValue("") @QueryParam("filter") String filter, 
                                 @DefaultValue("+nome") @QueryParam("sort") String sort) {
        return repository.findAll();
    }
    
    @GET
    @Path("headers")
    @Produces(MediaType.APPLICATION_JSON)
    public Response headersUtils(@Context HttpHeaders headers) {
        Map<String, String> dados = new HashMap<>();
        dados.put("strHeader", headers.getHeaderString("X-Header-String"));
        dados.put("todoHeader", headers.toString());
        return Response.ok(dados).build();
    }
    
    @GET
    @Path("uri")
    @Produces(MediaType.APPLICATION_JSON)
    public Response uriDetails() {
        Map<String, String> dados = new HashMap<>();
        dados.put("host", uriInfo.getBaseUri().getHost());
        dados.put("path", uriInfo.getPath());
        dados.put("parametroTeste", 
                uriInfo.getQueryParameters().get("teste").toString());
        
        return Response.ok(dados).build();
    }
    
    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Cliente findById(@PathParam("id") long id) {
        return repository.findById(id);
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response insert(Cliente cli) {
        repository.add(cli);
        return Response.status(Response.Status.CREATED).entity(cli).build();
    }
    
    @PUT
    @Path("{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response update(@PathParam("id") long id, Cliente cli) {
        repository.change(id, cli);
        return Response.ok(cli).build();
    }
    
    @DELETE
    @Path("{id}")
    public Response delete(@PathParam("id") long id) {
        repository.remove(id);
        return Response.noContent().build();
    }    
}