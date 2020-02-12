package com.ecommerce.ecommerceexample.domain.models.shoppings;

import com.ecommerce.ecommerceexample.domain.models.users.User;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "shoppings")
public class Shopping {

    @Id
    private Long id;

    @ManyToOne(targetEntity = User.class, cascade = CascadeType.ALL)
    @NotNull(message = "Not be possible shopping without user")
    private User user;

    @OneToMany(targetEntity = ShoppingProduct.class, cascade = CascadeType.ALL)
    @NotNull(message = "Not be possible shopping without products")
    private List<ShoppingProduct> products;

    @Column(name = "billeted", nullable = false, columnDefinition = "BOOLEAN DEFAULT true")
    private boolean billeted;

    @Column(name = "created_on", nullable = false, columnDefinition = "TIMESTAMP DEFAULT NOW()")
    private Date created_on;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<ShoppingProduct> getProducts() {
        return products;
    }

    public void setProducts(List<ShoppingProduct> products) {
        this.products = products;
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
