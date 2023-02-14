package com.cmp.dscommerce.dtos;

import jakarta.persistence.*;

import java.time.Instant;

public class PaymentDTO {

    private Long id;
    private Instant moment;
    private OrderDTO order;

    public PaymentDTO(){
    }

    public PaymentDTO(Long id, Instant moment) {
        this.id = id;
        this.moment = moment;
    }

    public Long getId() {
        return id;
    }

    public Instant getMoment() {
        return moment;
    }

    public OrderDTO getOrder() {
        return order;
    }
}
