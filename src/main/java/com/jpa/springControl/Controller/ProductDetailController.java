package com.jpa.springControl.Controller;

import com.jpa.springControl.Dto.AdminDto.ProductDetailDto;
import com.jpa.springControl.Repository.MainPageRepository;
import com.jpa.springControl.Service.MainPageService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
public class ProductDetailController {

    private final MainPageService mainPageService;

    @GetMapping("/api/mapage/{id}")
    public ProductDetailDto productDetailPage(@PathVariable @Valid Long id) {

        return mainPageService.DetailProduct(id);

        // 기본적으로 로직 자체의 특이점은 없다
        // 그저 dto를 활용해서 패치조인을 어떻게 짜느냐가 관건이다
        // 크게 본다면 댓글과 비슷한 비즈니스로직 이다
        //
    }
}
