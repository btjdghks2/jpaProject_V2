package com.jpa.springControl.Service;

import com.jpa.springControl.Dto.CartDto.CartListDto;
import com.jpa.springControl.Repository.CartRepository;
import com.jpa.springControl.Repository.MemberRepository;
import com.jpa.springControl.domain.Cart;
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

    public List<CartListDto> CartListLogic(Long userid){

        //아이디를 토대로 카트 목록을 불러와야 함
        //일단 멤버에서 아이디를 받고
        Cart cart = memberRepository.findById(userid);
        //userid에 적혀있는 컬럼 똑같은 아이디넘버를 가지고 있는 것을 가져와야 함
        = cartRepository.FindCartList(cart);
        //select userid form cart userid == userid;





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
