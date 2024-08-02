package io.hopper.shopping.service;

import io.hopper.shopping.model.OrderProduct;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.validation.annotation.Validated;

@Validated
public interface OrderProductService {

    OrderProduct create(@NotNull OrderProduct orderProduct);
}