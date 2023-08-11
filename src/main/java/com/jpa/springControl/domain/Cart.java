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
    private Long userid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "price")
    private Product price;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "imagelink")
    private Product imagelink;


    // 주문 상품 갯수
    @Column
    private int count;


    // 상품 이름 상품 상품 가격

    @OneToMany(mappedBy = "cart", cascade = CascadeType.ALL)
    private List<Product> products = new ArrayList<>();

//
//    @OneToMany(mappedBy = "cart")
//    private List<Comment> comments = new ArrayList<>();


//    public void setMember(Member member) {
//        this.member = member;
//        member.getCarts().add(this);
//    }
//
//    public void addProduct(Product product) {
//        products.add(product);
//        product.setCart(this);
//    }


    public Cart() {
        this.userid = userid;
        this.member = member;
        this.price = price;
        this.imagelink = imagelink;
        this.count = count;
        this.products = products;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Product getPrice() {
        return price;
    }

    public void setPrice(Product price) {
        this.price = price;
    }

    public Product getImagelink() {
        return imagelink;
    }

    public void setImagelink(Product imagelink) {
        this.imagelink = imagelink;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}