package com.acme.posiprice.repository;

import com.acme.posiprice.model.Buyer;
import com.acme.posiprice.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository {
    Page<Product> findByBuyerId(Long buyerId, Pageable pageable);
    Page<Product>findByPromoterId(Long promoterId, Pageable pageable);
    Optional<Product> findById(Long id);
}
