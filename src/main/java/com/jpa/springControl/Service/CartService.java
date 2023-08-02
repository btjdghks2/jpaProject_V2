package com.jpa.springControl.Service;

import com.jpa.springControl.Dto.CartDto.CartListDto;
import com.jpa.springControl.Repository.CartRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class CartService {

    private final CartRepository cartRepository;

    public List<CartListDto> CartList(Long id){


        return null;
    }


}
