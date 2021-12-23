package com.promo.promocode.services;

import com.promo.promocode.entity.PromoCode;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class PromoCodeService {

    public final List<PromoCode> promoCodes = new ArrayList<>();


    public List<PromoCode> createPromoCode(){

        for(int i =0; i<1000; i++) {

            String user = RandomStringUtils.random(8, true, false);

            PromoCode promoCode = new PromoCode();

            promoCode.setUser(user);

            promoCodes.add(promoCode);
        }
        log.info("Inside createPromoCode of PromoCodeService ");

        return promoCodes;
    }
}
