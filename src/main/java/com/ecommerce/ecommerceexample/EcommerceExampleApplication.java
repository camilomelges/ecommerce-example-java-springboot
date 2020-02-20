package com.ecommerce.ecommerceexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class,
		JpaRepositoriesAutoConfiguration.class})
@EnableCaching
@ComponentScan("com.ecommerce.ecommerceexample.infra.repositories")
public class EcommerceExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceExampleApplication.class, args);
	}

}
