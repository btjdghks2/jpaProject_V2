package com.jpa.springControl.Repository;

import com.jpa.springControl.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MainPageRepository extends JpaRepository<Product,Long> {

    @Override
    List<Product> findAll();
}
