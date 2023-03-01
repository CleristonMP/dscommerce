package com.cmp.dscommerce.services;

import com.cmp.dscommerce.dtos.OrderDTO;
import com.cmp.dscommerce.entities.Order;
import com.cmp.dscommerce.repositories.OrderRepository;
import com.cmp.dscommerce.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service

public class OrderService {

    @Autowired
    private OrderRepository repository;

    @Transactional(readOnly = true)
    public OrderDTO findById(Long id) {
        Order order = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Recurso não encontrado"));
        return new OrderDTO(order);
    }
}