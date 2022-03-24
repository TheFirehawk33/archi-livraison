package com.hemit.repository;

import com.hemit.model.Order;
import com.hemit.repository.models.OrderPatchDto;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.PATCH;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/order/")
@RegisterRestClient
public interface OrderClientRepository {
    @PATCH
    @Path("{orderId}")
    void getOrderById(@PathParam("orderId") String orderId, OrderPatchDto orderPatchDto);
}
