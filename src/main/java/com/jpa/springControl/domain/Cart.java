package com.jpa.springControl.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "Cart")
public class Cart {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;


    // 주문 상품 갯수
    @Column
    private int count;


    // 상품 이름 상품 상품 가격

    @OneToMany(mappedBy = "cart", cascade = CascadeType.ALL)
    private List<Product> products = new ArrayList<>();

//
//    @OneToMany(mappedBy = "cart")
//    private List<Comment> comments = new ArrayList<>();


    public void setMember(Member member) {
        this.member = member;
        member.getCarts().add(this);
    }

    public void addProduct(Product product) {
        products.add(product);
        product.setCart(this);
    }
}