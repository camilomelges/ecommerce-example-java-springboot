package com.ecommerce.ecommerceexample.domain.services;

public interface InsertService<T> {

    public void post(T t);

    public void put(T t, int id);
}
