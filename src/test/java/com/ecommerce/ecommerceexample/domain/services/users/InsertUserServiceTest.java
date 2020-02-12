package com.ecommerce.ecommerceexample.domain.services.users;

import com.ecommerce.ecommerceexample.domain.models.users.User;
import com.ecommerce.ecommerceexample.infra.repositories.UserRepository;
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
class InsertUserServiceTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private InsertUserService insertUserService;

    @Test
    void insertServiceShouldBeImplemented() {
        for(Class iface : InsertUserService.class.getInterfaces()) {
            assertEquals("com.ecommerce.ecommerceexample.domain.services.InsertService", iface.getName());
        }
    }

    @Test
    void userRepositorySaveShouldBeCall() {
        insertUserService.save(mock(User.class));
        verify(userRepository, times(1)).save(any(User.class));
    }
}