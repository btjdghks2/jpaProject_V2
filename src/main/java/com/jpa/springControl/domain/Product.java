package com.jpa.springControl.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Product {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    @Column
    private String textDescription;

    @Column
    private String imagelink;

    @Column
    private int productCount;

    @Column
    private int price;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cart_id")
    private Cart cart;


    public Product(Long id, String name, String imagelink, int price, String textDescription, int productCount) {
        this.id = id;
        this.name = name;
        this.imagelink = imagelink;
        this.textDescription = textDescription;
        this.price = price;
        this.productCount = productCount;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
        cart.getProducts().add(this);
    }




}
