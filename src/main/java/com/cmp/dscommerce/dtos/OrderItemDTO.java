package com.cmp.dscommerce.dtos;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

public class OrderItemDTO {

    private Integer quantity;
    private Double price;

    public OrderItemDTO(){
    }

    public OrderItemDTO(Integer quantity, Double price) {
        this.quantity = quantity;
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Double getPrice() {
        return price;
    }
}
