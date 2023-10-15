package org.example.service.impl;

import org.example.dao.OrderDAO;
import org.example.dto.OrderDTO;
import org.example.model.Order;
import org.example.service.OrderService;

import java.util.List;
import java.util.stream.Collectors;

public class OrderServiceImpl implements OrderService {
    private final OrderDAO orderDAO;

    public OrderServiceImpl(OrderDAO orderDAO) {
        this.orderDAO = orderDAO;
    }

    @Override
    public Order findByIdFullForm(int id) {
        return orderDAO.findById(id);
    }

    @Override
    public List<OrderDTO> findAllShortForm() {
        List<Order> orderList = orderDAO.findAll();
        List<OrderDTO> orderDTOList = orderList.stream()
                .map(this::orderToOrderDTO)
                .collect(Collectors.toList());
        return orderDTOList;
    }

    @Override
    public List<Order> findAllShortFormSortedById() {
        return null;
    }

    @Override
    public List<Order> findAllShortFormSortedByPrice() {
        return null;
    }

    @Override
    public List<Order> findAllShortFormSortedByOpeningDate() {
        return null;
    }

    @Override
    public List<Order> findAllShortFormSortedByCompletionDate() {
        return null;
    }

    @Override
    public List<Order> findAllShortFormSortedByStatus() {
        return null;
    }

    @Override
    public void save(Order order) {

    }

    @Override
    public void update(Order order) {

    }

    @Override
    public void delete(int id) {

    }

    private OrderDTO orderToOrderDTO(Order order) {
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setId(order.getId());
        orderDTO.setPrice(order.getPrice());
        orderDTO.setOpeningDate(order.getOpeningDate());
        orderDTO.setCompletionDate(order.getCompletionDate());
        orderDTO.setStatus(order.getStatus());

        return orderDTO;
    }

    private Order orderDTOToOrder(OrderDTO orderDTO) {
        Order order = new Order();
        order.setId(orderDTO.getId());
        order.setPrice(orderDTO.getPrice());
        order.setOpeningDate(orderDTO.getOpeningDate());
        order.setCompletionDate(orderDTO.getCompletionDate());
        order.setStatus(orderDTO.getStatus());

        return order;
    }
}
