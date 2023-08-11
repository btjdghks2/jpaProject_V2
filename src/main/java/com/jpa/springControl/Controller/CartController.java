package com.jpa.springControl.Controller;

import com.jpa.springControl.Dto.CartDto.CartListDto;
import com.jpa.springControl.Dto.CartDto.CreateCartDto;
import com.jpa.springControl.Service.CartService;
import com.jpa.springControl.domain.Cart;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CartController {

    private final CartService cartService;

    @GetMapping("/api/cart/{userid}/")
    public List<CartListDto> CartList(@PathVariable Long userid, @RequestBody CartListDto cartListDto) {

        return cartService.CartListLogic(userid);

    }

    @PostMapping("/api/cart/new")
    public Cart CreateCartList(@RequestBody CreateCartDto createCartDto){
        return cartService.CreateCartListLogic(createCartDto);

    }

    @PutMapping("/api/{id}/cart/update")
    public List<CartListDto> UpdateCartList(@PathVariable Long id, @RequestBody CartListDto cartListDto) {
        return cartService.UpdateCartListLogic(id);
    }

    @DeleteMapping("/api/{id}/cart/delete")
    public List<CartListDto> DeleteCartList(@PathVariable Long id, @RequestBody CartListDto cartListDto) {
        return cartService.DeleteCartListLogic(id);
    }
}
