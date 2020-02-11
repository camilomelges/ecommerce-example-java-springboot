package com.ecommerce.ecommerceexample.domain.services;

import java.util.List;
import java.util.Optional;

public interface ConsultationService<T> {

    public List<T> getAll();

    public Optional<T> getById(Long id);
}
