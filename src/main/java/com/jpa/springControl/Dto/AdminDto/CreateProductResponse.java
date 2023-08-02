package com.jpa.springControl.Dto.AdminDto;

import com.jpa.springControl.domain.Product;
import lombok.Data;

import javax.persistence.Column;

@Data
public class CreateProductResponse {

    @Column
    private Long id;
    @Column
    private String name;
    @Column
    private int productCount;
    @Column
    private int price;
    @Column
    private String textDescription;
    @Column
    private String imagelink;

    public CreateProductResponse(Product product) {
        this.id = product.getId();
        this.name = product.getName();
        this.productCount = product.getProductCount();
        this.price = product.getPrice();
        this.textDescription = product.getTextDescription();
        this.imagelink = product.getImagelink();
    }
}