package com.ecommerce.ecommerceexample.domain.services;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class InsertServiceTest {

    @Test
    void shouldBeExistsPost() {
        Assertions.assertThatCode(() -> InsertService.class.getMethod("post", Object.class)).doesNotThrowAnyException();
    }

    @Test
    void shouldBeExistsPut() {
        Assertions.assertThatCode(() -> InsertService.class.getMethod("put", Object.class, int.class))
                  .doesNotThrowAnyException();
    }
}