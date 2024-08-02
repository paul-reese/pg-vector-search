package io.hopper.shopping.service;

import io.hopper.shopping.model.Order;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.validation.annotation.Validated;

@Validated
public interface OrderService {

    @NotNull
    Iterable<Order> getAllOrders();

    Order create(@NotNull Order order);

    void update(@NotNull Order order);
}