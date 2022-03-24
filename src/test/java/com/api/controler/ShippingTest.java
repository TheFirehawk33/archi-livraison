package com.api.controler;

import com.api.controler.mock.OrderClientRepositoryMock;
import com.hemit.controller.model.ShippingRequestDto;
import com.hemit.model.Order;
import com.hemit.repository.OrderClientRepository;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import javax.inject.Inject;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class ShippingTest {

    @Inject
    OrderClientRepository orderClientRepository;

    @Test
    public void send_valid_request_returns_204() {
        given()
            .contentType("application/json")
            .body(new ShippingRequestDto("123", 2))
            .when()
            .post("/api/shipping")
            .then()
                .statusCode(204);

        Assertions.assertEquals(0, ((OrderClientRepositoryMock)orderClientRepository).orderCalled.size());
    }

    @Test
    public void should_request_the_orders_once_five_products_are_to_be_shipped() {
        given()
                .contentType("application/json")
                .body(new ShippingRequestDto("234", 4))
                .when()
                .post("/api/shipping");
        given()
                .contentType("application/json")
                .body(new ShippingRequestDto("567", 1))
                .when()
                .post("/api/shipping");

        Assertions.assertEquals(2, ((OrderClientRepositoryMock)orderClientRepository).orderCalled.size());
    }

    @Test
    public void send_invalid_request_returns_400() {
        given()
                .contentType("application/json")
                .when()
                .post("/api/shipping")
                .then()
                .statusCode(400);
    }

}
