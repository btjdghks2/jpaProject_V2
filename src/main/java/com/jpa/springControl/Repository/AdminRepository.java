package com.jpa.springControl.Repository;

import com.jpa.springControl.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Product,Long> {

}
