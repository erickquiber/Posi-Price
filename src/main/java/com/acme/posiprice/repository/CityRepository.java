package com.acme.posiprice.repository;

import com.acme.posiprice.model.Buyer;
import com.acme.posiprice.model.City;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CityRepository extends JpaRepository {
    Page<City> findByCountryId(Long countryId, Pageable pageable);
    Optional<City> findById(Long id);
}
