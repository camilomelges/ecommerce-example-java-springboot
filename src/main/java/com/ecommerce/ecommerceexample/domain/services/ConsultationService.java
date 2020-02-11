package com.ecommerce.ecommerceexample.domain.services;

import java.util.List;

public interface ConsultationService<T> {

    public List<T> getAll();

    public T getById(int id);
}
