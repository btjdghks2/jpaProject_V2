package com.jpa.springControl.Dto.AdminDto;

import com.jpa.springControl.domain.Product;
import lombok.Data;

import javax.persistence.Column;

@Data

public class UpdateProductResponse {

    @Column
    private Long id;
    @Column
    private String name;
    @Column
    private int productCount;
    @Column
    private String textDescription;
    @Column
    private String imagelink;
    @Column
    private int price;

    public UpdateProductResponse(Product product) {
        this.id = product.getId();
        this.name = product.getName();
        this.productCount = product.getProductCount();
        this.price = product.getPrice();
        this.textDescription = product.getTextDescription();
        this.imagelink = product.getImagelink();

    }




}