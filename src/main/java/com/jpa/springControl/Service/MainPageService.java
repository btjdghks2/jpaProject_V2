package com.jpa.springControl.Service;

import com.jpa.springControl.Dto.AdminDto.ProductDetailDto;
import com.jpa.springControl.Dto.Main.MainListDto;
import com.jpa.springControl.Repository.MainPageRepository;
import com.jpa.springControl.domain.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional
public class MainPageService {

    private final MainPageRepository mainPageRepository;

    public List<MainListDto> MainProductList() {

        List<Product> productList = mainPageRepository.findAll();
        List<MainListDto> mainListDto = productList.stream()
                .map(p -> new MainListDto(p))
                .collect(Collectors.toList());

        return mainListDto;
    }

    public ProductDetailDto DetailProduct(Long id) {

        Product product = mainPageRepository.findById(id).orElseThrow(EntityNotFoundException::new);
        ProductDetailDto productDetailDto = new ProductDetailDto(product);

        return productDetailDto;

    }





}
