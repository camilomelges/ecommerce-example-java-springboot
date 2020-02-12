package com.ecommerce.ecommerceexample.domain.models.shoppings;

import com.ecommerce.ecommerceexample.domain.models.users.User;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "shopping_products")
public class ShoppingProduct {

    @Id
    private Long id;

    @ManyToOne(targetEntity = Product.class)
    @NotNull(message = "Not be possible insert shopping_products without shopping")
    private Product product;

    @Column(name = "quantity", nullable = false)
    private boolean billeted;

    @Column(name = "created_on", nullable = false, columnDefinition = "TIMESTAMP DEFAULT NOW()")
    private Date created_on;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public boolean isBilleted() {
        return billeted;
    }

    public void setBilleted(boolean billeted) {
        this.billeted = billeted;
    }

    public Date getCreated_on() {
        return created_on;
    }

    public void setCreated_on(Date created_on) {
        this.created_on = created_on;
    }
}
