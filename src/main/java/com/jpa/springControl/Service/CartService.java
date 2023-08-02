package com.jpa.springControl.Service;

import com.jpa.springControl.Dto.CartDto.CartListDto;
import com.jpa.springControl.Repository.CartRepository;
import com.jpa.springControl.Repository.MemberRepository;
import com.jpa.springControl.domain.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class CartService {

    private final CartRepository cartRepository;
    private final MemberRepository memberRepository;

    public List<CartListDto> CartListLogic(Long id){
        Member member = memberRepository.findById(id);



        return null;
    }


    public List<CartListDto> CreateCartListLogic(Long id) {

        return null;
    }

    public List<CartListDto> UpdateCartListLogic(Long id) {
        return null;
    }

    public List<CartListDto> DeleteCartListLogic(Long id) {
        return null;
    }
}
