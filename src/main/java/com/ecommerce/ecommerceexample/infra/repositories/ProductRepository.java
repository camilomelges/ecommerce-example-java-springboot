package com.ecommerce.ecommerceexample.infra.repositories;

import com.ecommerce.ecommerceexample.domain.models.shoppings.Product;
import com.ecommerce.ecommerceexample.domain.models.shoppings.Shopping;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
