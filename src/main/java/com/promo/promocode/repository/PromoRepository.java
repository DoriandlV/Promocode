package com.promo.promocode.repository;

import com.promo.promocode.entity.PromoCode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PromoRepository extends JpaRepository<PromoCode,Long> {
    
}
