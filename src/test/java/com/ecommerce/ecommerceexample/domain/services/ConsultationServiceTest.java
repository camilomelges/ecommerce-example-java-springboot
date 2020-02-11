package com.ecommerce.ecommerceexample.domain.services;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ConsultationServiceTest {

    @Test
    void shouldBeExistsGetAll() {
        Assertions.assertThatCode(() -> ConsultationService.class.getMethod("getAll")).doesNotThrowAnyException();
    }

    @Test
    void shouldBeExistsGetById() {
        Assertions.assertThatCode(() -> ConsultationService.class.getMethod("getById", Long.class))
                  .doesNotThrowAnyException();
    }
}