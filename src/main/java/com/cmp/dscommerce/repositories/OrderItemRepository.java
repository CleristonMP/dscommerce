package com.cmp.dscommerce.repositories;

import com.cmp.dscommerce.entities.OrderItem;
import com.cmp.dscommerce.entities.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
}
