package com.optum.chwy;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class ExampleResource {

    @Inject
    @RestClient
    CallGraphEndpoint callGraphEndpoint;


    @GET
    @Path("/retrievedata")
    @Produces(MediaType.APPLICATION_JSON)
    public String retrievedata() {
        String body = "{ \"query\":\"{continents{name countries { name}}}\"}";
        return callGraphEndpoint.getDataFromGraphEndpoints(body);
    }
    @POST
    @Path("/getdata")
    @Produces(MediaType.APPLICATION_JSON)
    public String getdatas(String Requestdata) {
        return callGraphEndpoint.getDataFromGraphEndpoints(new Query(Requestdata));
    }

}