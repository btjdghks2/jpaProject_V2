package com.jpa.springControl.Repository;

import com.jpa.springControl.domain.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart,Long> {
}
