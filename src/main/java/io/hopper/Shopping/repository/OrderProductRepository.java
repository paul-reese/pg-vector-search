package io.hopper.shopping.repository;

import io.hopper.shopping.model.OrderProduct;
import io.hopper.shopping.model.OrderProductPK;
import org.springframework.data.repository.CrudRepository;

public interface OrderProductRepository extends CrudRepository<OrderProduct, OrderProductPK> {
}
