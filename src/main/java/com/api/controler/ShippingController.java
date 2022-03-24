package com.api.controler;

import com.hemit.controller.model.ShippingRequestDto;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/api/shipping")
public class ShippingController {

    @POST
    @Produces("application/json")
    @Consumes("application/json")
    public void getCommand(ShippingRequestDto command) {
        if (command == null) {
            throw new BadRequestException("Shipping Request must be provided");
        }
    }
}
