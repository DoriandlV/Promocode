package com.promo.promocode.repository;

import com.promo.promocode.entity.PromoCode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PromoRepository extends JpaRepository<PromoCode,Long> {

    Optional<PromoCode> findByUserId(String userId);
    Optional<PromoCode> findFirst1ByUserIdIsNull();
}
