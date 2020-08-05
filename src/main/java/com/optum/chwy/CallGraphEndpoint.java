package com.optum.chwy;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * @author Amit Dixit
 */
@Path("/graphql")
@RegisterRestClient
public interface CallGraphEndpoint {
    @POST
    @Path("/")
    @Produces("application/json")
    @Consumes("application/json")
    String getDataFromGraphEndpoints(Object Body);
}
