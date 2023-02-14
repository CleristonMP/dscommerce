package com.cmp.dscommerce.dtos;

import com.cmp.dscommerce.entities.OrderStatus;
import jakarta.persistence.*;

import java.time.Instant;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class OrderDTO {

    private Long id;
    private Instant moment;
    private OrderStatus status;
    private UserDTO client;
    private PaymentDTO payment;

    public OrderDTO(){
    }

    public OrderDTO(Long id, Instant moment, OrderStatus status, UserDTO client, PaymentDTO payment) {
        this.id = id;
        this.moment = moment;
        this.status = status;
        this.client = client;
        this.payment = payment;
    }

    public Long getId() {
        return id;
    }

    public Instant getMoment() {
        return moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public UserDTO getClient() {
        return client;
    }

    public PaymentDTO getPayment() {
        return payment;
    }
}
