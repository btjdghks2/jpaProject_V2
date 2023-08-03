package com.jpa.springControl.Dto.CartDto;

import com.jpa.springControl.domain.Member;
import com.jpa.springControl.domain.Product;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Data
@Setter
@Getter
public class CartListDto {

    private Long id;

    private Member member;

    private int count;

    private List<Product> products = new ArrayList<>();

    public CartListDto() {
        this.id = id;
        this.member = member;
        this.count = count;
        this.products = products;
    }


}
