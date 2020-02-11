package com.ecommerce.ecommerceexample.infra.repositories;

import com.ecommerce.ecommerceexample.domain.models.users.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
