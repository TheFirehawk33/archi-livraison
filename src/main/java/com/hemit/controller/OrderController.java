package com.hemit.controller;

import com.hemit.model.Order;
import com.hemit.repository.OrderRepository;
import io.quarkus.mongodb.panache.PanacheQuery;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("order")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class OrderController {

    @Inject
    public OrderRepository orderRepository;

    @GET
    public Response getOrders(Order order) {
        PanacheQuery<Order> result = orderRepository.findAll();
        return Response.status(Response.Status.ACCEPTED).entity(result.list()).build();
    }

}
