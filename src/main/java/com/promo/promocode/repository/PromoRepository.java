package com.promo.promocode.repository;

import com.promo.promocode.entity.PromoCode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PromoRepository extends JpaRepository<PromoCode,Long> {
}
