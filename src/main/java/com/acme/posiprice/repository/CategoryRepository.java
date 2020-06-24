package com.acme.posiprice.repository;

import com.acme.posiprice.model.Buyer;
import com.acme.posiprice.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository {
    Page<Category> findByProductId(Long productId, Pageable pageable);
    Optional<Category> findById(Long id);
}
