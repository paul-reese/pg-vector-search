package io.hopper.shopping.repository;

import io.hopper.shopping.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
