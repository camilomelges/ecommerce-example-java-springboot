package com.ecommerce.ecommerceexample.domain.services.shoppings.products;

import com.ecommerce.ecommerceexample.domain.models.shoppings.Product;
import com.ecommerce.ecommerceexample.domain.services.ConsultationService;
import com.ecommerce.ecommerceexample.infra.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConsultationProductService implements ConsultationService<Product> {

    private ProductRepository productRepository;

    public ConsultationProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getAll() {
        return (List<Product>) productRepository.findAll();
    }

    @Override
    public Optional<Product> getById(Long id) {
        return productRepository.findById(id);
    }
}
