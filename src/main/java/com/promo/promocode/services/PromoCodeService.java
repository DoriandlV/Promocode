package com.promo.promocode.services;

import com.promo.promocode.entity.PromoCode;
import com.promo.promocode.repository.PromoRepository;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
public class PromoCodeService {

    @Autowired
    PromoRepository promoRepository;

    public void savePromoCode() {


        String promo = RandomStringUtils.random(8, true, false);
        PromoCode promoCode = new PromoCode();
        promoCode.setPromoCode(promo);

        promoRepository.save(promoCode);

        log.info("Inside createPromoCode of PromoCodeService ");


    }

    public PromoCode addPromoToUser(String userId) {

        log.info("Inside addPromoToUser of PromoCodeService ");

        Optional<PromoCode> byUserId = promoRepository.findByUserId(userId);
        if (byUserId.isPresent()) {
            return byUserId.get();
        } else {
            Optional<PromoCode> freePromo = promoRepository.findFirst1ByUserIdIsNull();
            if (freePromo.isPresent()) {
                PromoCode promoCode = freePromo.get();
                promoCode.setUserId(userId);
                promoRepository.save(promoCode);
                return promoCode;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    public void createData() {
        for (int i = 0; i < 1000; i++) {
            savePromoCode();
            log.info("Inside createDATA of PromoCodeService ");
        }


    }

}
