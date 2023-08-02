package com.jpa.springControl.Controller;

import com.jpa.springControl.Dto.CartDto.CartListDto;
import com.jpa.springControl.Repository.CartRepository;
import com.jpa.springControl.Service.CartService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CartController {

    private final CartService cartService;

    @GetMapping("/api/Cart/{id}")
    public List<CartListDto> CartList(@PathVariable Long id, @RequestBody CartListDto cartListDto) {

        return cartService.CartList(id);

    }
}
