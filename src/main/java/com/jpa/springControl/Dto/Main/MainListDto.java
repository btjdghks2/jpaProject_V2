package com.jpa.springControl.Dto.Main;

import com.jpa.springControl.domain.Product;
import lombok.Data;

import javax.persistence.Column;

@Data
public class MainListDto {

    @Column
    private Long id;

    @Column
    private String name;

    @Column
    private String imagelink;

    @Column
    private int price;

    public MainListDto(Product product) {
        this.id = id;
        this.name = name;
        this.imagelink = imagelink;
        this.price = price;
    }


}