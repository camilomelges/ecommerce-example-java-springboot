package com.ecommerce.ecommerceexample.domain.services.users;

import com.ecommerce.ecommerceexample.infra.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.ArgumentMatchers.any;

@ExtendWith(MockitoExtension.class)
@RunWith(PowerMockRunner.class)
class ConsultationUserServiceTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private ConsultationUserService consultationUserService;

    @Test
    void consultationServiceShouldBeImplemented() {
        for(Class iface : ConsultationUserService.class.getInterfaces()) {
            assertEquals("com.ecommerce.ecommerceexample.domain.services.ConsultationService", iface.getName());
        }
    }

    @Test
    void userRepositoryFindAllShouldBeCall() {
        consultationUserService.getAll();
        verify(userRepository, times(1)).findAll();
    }

    @Test
    void userRepositoryFindByIdShouldBeCall() {
        consultationUserService.getById(Long.MAX_VALUE);
        verify(userRepository, times(1)).findById(any(Long.class));
    }
}