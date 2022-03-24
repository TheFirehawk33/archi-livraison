package com.api.controler;

import com.api.model.ShippingRequestDto;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/api/shipping")
public class shipping {

    @POST
    public Response.ResponseBuilder getCommand(ShippingRequestDto command) {
        if (command == null) {
            return Response.status(404);
        } else {
            return Response.status(202);
        }
    }
}
