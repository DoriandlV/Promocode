package com.promo.promocode.controller;


import com.promo.promocode.entity.PromoCode;
import com.promo.promocode.services.PromoCodeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/promo")
@Slf4j
public class PromoController {

    @Autowired
    PromoCodeService promoCodeService;

    @GetMapping("/notassigned")
    public PromoCode notAssigned (@RequestParam String userId) {

        return promoCodeService.addPromoToUser(userId);
    }

    @GetMapping("/generatedata")
    public void generate () {
        promoCodeService.createData();
    }

}
