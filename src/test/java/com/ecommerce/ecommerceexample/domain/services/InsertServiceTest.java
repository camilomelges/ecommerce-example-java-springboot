package com.ecommerce.ecommerceexample.domain.services;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class InsertServiceTest {

    @Test
    void shouldBeExistsSave() {
        Assertions.assertThatCode(() -> InsertService.class.getMethod("save", Object.class)).doesNotThrowAnyException();
    }
}