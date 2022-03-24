package com.hemit.repository;

import com.hemit.model.Order;
import io.quarkus.mongodb.panache.PanacheMongoRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class OrderRepository implements PanacheMongoRepository<Order> {
    public Order findByName(String name) {
        return find("name", name).firstResult();
    }
}
