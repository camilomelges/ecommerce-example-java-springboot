package com.ecommerce.ecommerceexample.domain.services.users;

import com.ecommerce.ecommerceexample.domain.models.users.User;
import com.ecommerce.ecommerceexample.domain.services.ConsultationService;
import com.ecommerce.ecommerceexample.infra.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConsultationUserService implements ConsultationService<User> {

    private UserRepository userRepository;

    @Override
    public List<User> getAll() {
        return (List<User>) userRepository.findAll();
    }

    @Override
    public Optional<User> getById(Long id) {
        return userRepository.findById(id);
    }
}
