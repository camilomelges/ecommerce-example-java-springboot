package com.ecommerce.ecommerceexample.domain.services.shoppings.products;

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
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
@RunWith(PowerMockRunner.class)
class ConsultationProductServiceTest {

    @Mock
    private ProductRepository productRepository;

    @InjectMocks
    private ConsultationProductService consultationUserService;

    @Test
    void consultationServiceShouldBeImplemented() {
        for (Class iface : ConsultationProductService.class.getInterfaces()) {
            assertEquals("com.ecommerce.ecommerceexample.domain.services.ConsultationService", iface.getName());
        }
    }

    @Test
    void productRepositoryFindAllShouldBeCall() {
        consultationUserService.getAll();
        verify(productRepository, times(1)).findAll();
    }

    @Test
    void productRepositoryFindByIdShouldBeCall() {
        consultationUserService.getById(Long.MAX_VALUE);
        verify(productRepository, times(1)).findById(any(Long.class));
    }
}