package com.jpa.springControl.Dto.CartDto;

import com.jpa.springControl.domain.Cart;
import com.jpa.springControl.domain.Product;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class CreateCartDto {

    private Cart userid;
    private Product price;
    private Product imagelink;

    public CreateCartDto(Cart userid, Product price, Product imagelink) {
        this.userid = userid;
        this.price = price;
        this.imagelink = imagelink;
    }

    public Cart getUserid() {
        return userid;
    }

    public void setUserid(Cart cart) {
        this.userid = userid;
    }

    public Product getPrice() {
        return price;
    }

    public void setPrice(Product product) {
        this.price = price;
    }

    public Product getImagelink() {
        return imagelink;
    }

    public void setImagelink(Product product) {
        this.imagelink = imagelink;
    }
}


