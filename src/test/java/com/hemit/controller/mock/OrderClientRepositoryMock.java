package com.hemit.controller.mock;

import com.hemit.repository.OrderClientRepository;
import com.hemit.repository.models.OrderPatchDto;

import javax.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class OrderClientRepositoryMock implements OrderClientRepository {
    public List<String> orderCalled = new ArrayList<String>();

    @Override
    public void getOrderById(String orderId, OrderPatchDto orderPatchDto) {
        orderCalled.add(orderId);
    }
}
