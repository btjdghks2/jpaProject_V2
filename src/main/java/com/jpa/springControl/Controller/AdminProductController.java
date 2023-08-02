package com.jpa.springControl.Controller;


import com.jpa.springControl.Dto.AdminDto.CreateProductResponse;
import com.jpa.springControl.Dto.AdminDto.UpdateProductResponse;
import com.jpa.springControl.Service.AdminProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@Transactional
public class AdminProductController {


    private final AdminProductService adminProductService;

    @PostMapping("/api/admin/new")
    public CreateProductResponse ProductSave(@RequestBody CreateProductResponse createProductResponse) {

        return adminProductService.join(createProductResponse);

    }

    @PutMapping("/api/admin/{id}/update/")
    public UpdateProductResponse ProductUpdate(@PathVariable Long id, @RequestBody  UpdateProductResponse updateProductResponse) {

        return adminProductService.updatelogic(id, updateProductResponse);
    }

    @DeleteMapping("/api/admin/{id}/delete")
    public String ProductDelete(@PathVariable Long id) {

        return adminProductService.deletelogic(id);
    }







}
