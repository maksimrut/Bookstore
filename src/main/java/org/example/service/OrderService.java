package org.example.service;

import org.example.dto.OrderDTO;
import org.example.model.Order;

import java.util.List;

public interface OrderService {
    Order findByIdFullForm(int id);
    List<OrderDTO> findAllShortForm();
    List<Order> findAllShortFormSortedById();
    List<Order> findAllShortFormSortedByPrice();
    List<Order> findAllShortFormSortedByOpeningDate();
    List<Order> findAllShortFormSortedByCompletionDate();
    List<Order> findAllShortFormSortedByStatus();
    void save(Order order);
    void update(Order order);
    void delete(int id);
}
