package com.ecommerce.ecommerceexample.infra.repositories;

import com.ecommerce.ecommerceexample.domain.models.shoppings.Shopping;
import com.ecommerce.ecommerceexample.domain.models.users.User;
import org.springframework.data.repository.CrudRepository;

public interface ShoppingRepository extends CrudRepository<Shopping, Long> {
}
