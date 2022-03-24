package com.hemit.model;

import io.quarkus.mongodb.panache.PanacheMongoEntity;

public class Order extends PanacheMongoEntity {
    public String name;
    public Boolean delivered;

    public Order(String name, Boolean delivered) {
        this.name = name;
        this.delivered = delivered;
    }

    public Order() {}
}
