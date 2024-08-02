package io.hopper.shopping.service;

import io.hopper.shopping.model.Product;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.validation.annotation.Validated;

@Validated
public interface ProductService {

    Iterable<Product> getAllProducts();

    Product getProduct(long id);

    Product save(Product product);
}