package com.jpa.springControl.Dto.CartDto;

import com.jpa.springControl.domain.Product;
import lombok.Data;

@Data
public class UpdateCartDto {

    private Long userid;
    private Product price;
    private Product imagelink;


}
