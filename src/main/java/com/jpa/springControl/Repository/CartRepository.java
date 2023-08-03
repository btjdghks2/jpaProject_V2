package com.jpa.springControl.Repository;

import com.jpa.springControl.domain.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CartRepository extends JpaRepository<Cart,Long> {

    @Query("select c from cart c join fetch c.member m")
    List<Cart> FindCartList();


}
