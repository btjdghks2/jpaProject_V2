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

    private Long userid;
    private Product price;
    private Product imagelink;

    public CreateCartDto() {
        this.userid = userid;
        this.price = price;
        this.imagelink = imagelink;
    }

    public static CreateCartDto from(Cart cart){
        CreateCartDto createCartDto = new CreateCartDto();
        createCartDto.setUserid(cart.getUserid());
        createCartDto.setPrice(cart.getPrice());
        createCartDto.setImagelink(cart.getImagelink());

        return createCartDto;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long cart) {
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


