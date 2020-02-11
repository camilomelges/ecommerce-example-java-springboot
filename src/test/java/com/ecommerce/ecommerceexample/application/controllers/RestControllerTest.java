package com.ecommerce.ecommerceexample.application.controllers;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class RestControllerTest {

    @Test()
    void shouldBeExistGetAll() {
        Assertions.assertThatCode(() -> RestController.class.getMethod("getAll")).doesNotThrowAnyException();
    }

    @Test
    void shouldBeExistGetById() {
        Assertions.assertThatCode(() -> RestController.class.getMethod("getById", int.class))
                  .doesNotThrowAnyException();
    }

    @Test
    void shouldBeExistPost() {
        Assertions.assertThatCode(() -> RestController.class.getMethod("post", Object.class))
                  .doesNotThrowAnyException();
    }

    @Test
    void shouldBeExistPut() {
        Assertions.assertThatCode(() -> RestController.class.getMethod("put", Object.class, int.class))
                  .doesNotThrowAnyException();
    }
}