package com.ecommerce.ecommerceexample.domain.services.users;

import com.ecommerce.ecommerceexample.domain.models.users.User;
import com.ecommerce.ecommerceexample.domain.services.ConsultationService;
import com.ecommerce.ecommerceexample.domain.services.InsertService;
import com.ecommerce.ecommerceexample.infra.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InsertUserService implements InsertService<User> {

    private UserRepository userRepository;

    public InsertUserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }
}
