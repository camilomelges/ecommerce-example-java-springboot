package com.ecommerce.ecommerceexample.domain.models.users;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "user_groups")
public class UserGroup {

    @Id
    private Long id;

    @Column(name = "name", nullable = false, columnDefinition = "user_type DEFAULT 'BUYER'")
    private String name;

    @ManyToOne(targetEntity = User.class)
    private User user;

    @Column(name = "created_on", nullable = false, columnDefinition = "TIMESTAMP DEFAULT NOW()")
    private Date created_on;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getCreated_on() {
        return created_on;
    }

    public void setCreated_on(Date created_on) {
        this.created_on = created_on;
    }
}
