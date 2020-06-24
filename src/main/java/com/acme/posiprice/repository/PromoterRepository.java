package com.acme.posiprice.repository;

import com.acme.posiprice.model.Buyer;
import com.acme.posiprice.model.Promoter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PromoterRepository extends JpaRepository {

    Optional<Promoter> findById(Long id);
}
