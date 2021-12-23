package com.promo.promocode.controller;


import com.promo.promocode.entity.PromoCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController("promo")
@Slf4j
public class PromoController {

    @Autowired
    PromoCode promoCode;

    @GetMapping("/notassigned/{id}")
    PromoCode notAssigned (@PathVariable Long id) {

        return promoCode;
    }

}
