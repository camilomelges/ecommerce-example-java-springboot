package com.ecommerce.ecommerceexample.application.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/anything")
public interface RestController<T> {

    @GetMapping("/")
    public List<T> getAll();

    @GetMapping("/{id}")
    public T getById(@PathVariable Long id);

    @PostMapping()
    public void post(@RequestBody T t);

    @PutMapping()
    public void put(@RequestBody T t);
}
