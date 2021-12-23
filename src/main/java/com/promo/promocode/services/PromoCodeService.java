package com.promo.promocode.services;

import com.promo.promocode.entity.PromoCode;
import com.promo.promocode.repository.PromoRepository;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class PromoCodeService {

    public final List<PromoRepository> promoCodes = new ArrayList<>();

    @Autowired
    PromoRepository promoRepository;

    public PromoCode savePromoCode(){


            String user = RandomStringUtils.random(8, true, false);

            PromoCode promoCode = new PromoCode();

            promoCode.setUser(user);


        log.info("Inside createPromoCode of PromoCodeService ");

        return promoRepository.save(promoCode);
    }
}