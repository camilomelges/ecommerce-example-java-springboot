package com.ecommerce.ecommerceexample.domain.models.shoppings;

import com.ecommerce.ecommerceexample.domain.models.users.User;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "shoppings")
public class Shopping {

    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

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
