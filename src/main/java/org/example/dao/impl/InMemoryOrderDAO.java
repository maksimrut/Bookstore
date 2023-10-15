package org.example.dao.impl;

import org.example.dao.OrderDAO;
import org.example.model.Order;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryOrderDAO implements OrderDAO {
    private final Map<Integer, Order> orderStore = new HashMap<>();
    private int lastId = 0;

    @Override
    public Order findById(int id) {
        return orderStore.get(id);
    }

    @Override
    public List<Order> findAll() {
        return new ArrayList<>(orderStore.values());
    }

    @Override
    public void save(Order order) {
        order.setId(lastId);
        orderStore.put(lastId, order);
        lastId = lastId + 1;
    }

    @Override
    public void update(Order order) {
        int orderId = order.getId();

        if (orderStore.containsKey(orderId)) {
            orderStore.put(orderId, order);
        } else {
            // TODO: 14.10.2023 return Exception
        }
    }

    @Override
    public void delete(int id) {
        orderStore.remove(id);
    }
}
