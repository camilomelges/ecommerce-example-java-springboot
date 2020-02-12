package com.ecommerce.ecommerceexample.domain.services;

import org.springframework.stereotype.Service;

public interface InsertService<T> {

    public T save(T t);
}
