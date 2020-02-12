package com.ecommerce.ecommerceexample.domain.services.shoppings.products;

import com.ecommerce.ecommerceexample.domain.models.shoppings.Product;
import com.ecommerce.ecommerceexample.domain.services.InsertService;
import com.ecommerce.ecommerceexample.infra.repositories.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class InsertProductService implements InsertService<Product> {

    private ProductRepository productRepository;

    public InsertProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }
}
