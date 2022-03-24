package com.hemit.repository;

import com.hemit.repository.models.StockUpdate;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/stock/")
@RegisterRestClient
public interface StockRepository {

    @Path("{productId}")
    @POST
    void decrementStock(@PathParam("productId") String productId, StockUpdate update);
}
