package com.acme.posiprice.repository;

import com.acme.posiprice.model.Buyer;
import com.acme.posiprice.model.Tracking;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.tools.JavaCompiler;
import java.util.Optional;

@Repository
public interface TrackingRepository extends JpaRepository {
    Page<Tracking> findByProductId(Long productId, Pageable pageable);
    Optional<Tracking> findById(Long id);
    Page<Tracking>findByBuyerId(Long buyerId, Pageable pageable);

}
