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
    }
}
