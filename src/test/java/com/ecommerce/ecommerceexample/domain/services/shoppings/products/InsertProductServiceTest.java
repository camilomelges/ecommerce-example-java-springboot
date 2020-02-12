package com.ecommerce.ecommerceexample.domain.services.users;

import com.ecommerce.ecommerceexample.domain.models.shoppings.Product;
import com.ecommerce.ecommerceexample.domain.services.shoppings.products.InsertProductService;
import com.ecommerce.ecommerceexample.infra.repositories.ProductRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
@RunWith(PowerMockRunner.class)
class InsertProductServiceTest {

    @Mock
    private ProductRepository productRepository;

    @InjectMocks
    private InsertProductService insertProductService;

    @Test
    void insertServiceShouldBeImplemented() {
        for(Class iface : InsertProductService.class.getInterfaces()) {
            assertEquals("com.ecommerce.ecommerceexample.domain.services.InsertService", iface.getName());
        }
    }

    @Test
    void productRepositorySaveShouldBeCall() {
        insertProductService.save(mock(Product.class));
        verify(productRepository, times(1)).save(any(Product.class));
    }
}