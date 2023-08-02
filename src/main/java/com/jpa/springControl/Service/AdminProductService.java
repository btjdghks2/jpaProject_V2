package com.jpa.springControl.Service;

import com.jpa.springControl.Dto.AdminDto.CreateProductResponse;
import com.jpa.springControl.Dto.AdminDto.UpdateProductResponse;
import com.jpa.springControl.Repository.AdminRepository;
import com.jpa.springControl.domain.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;

@Service
@RequiredArgsConstructor
@Transactional
public class AdminProductService {


    private final AdminRepository adminRepository;

    public CreateProductResponse join(CreateProductResponse createProductResponse) {
        Product product = new Product(  createProductResponse.getId(),
                createProductResponse.getName(),
                createProductResponse.getImagelink(),
                createProductResponse.getPrice(),
                createProductResponse.getTextDescription(),
                createProductResponse.getProductCount());

        adminRepository.save(product);
        return new CreateProductResponse(product);
    }

    public UpdateProductResponse updatelogic(Long id, UpdateProductResponse updateProductResponse) {

        Product product = adminRepository.findById(id).orElseThrow(EntityNotFoundException::new);

        product.setName(product.getName());
        product.setTextDescription(product.getTextDescription());
        product.setImagelink(product.getImagelink());
        product.setPrice(product.getPrice());
        product.setProductCount(product.getProductCount());
        adminRepository.save(product);


        return new UpdateProductResponse(product);

    }

    public String deletelogic(Long id) {
        Product product = adminRepository.findById(id).orElseThrow(EntityNotFoundException::new);

        adminRepository.deleteById(id);
        return "ok";
    }
}
