package com.acme.posiprice.repository;

import com.acme.posiprice.model.Buyer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BuyerRepository extends JpaRepository {
    Page<Buyer>findByProductId(Long productId, Pageable pageable);
    Optional<Buyer>findById(Long id);
    Page<Buyer>findByPromoterId(Long promoterId, Pageable pageable);




}
