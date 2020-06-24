package com.acme.posiprice.service;

import com.acme.posiprice.model.Buyer;
import org.springframework.data.domain.Page;

import java.awt.print.Pageable;

public interface BuyerService {
    Page<Buyer>getAllBuyersByProductID(Long productId, Pageable pageable);

}
