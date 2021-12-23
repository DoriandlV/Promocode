package com.promo.promocode;

import com.promo.promocode.repository.PromoRepository;
import com.promo.promocode.services.PromoCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PromocodeApplication {
	@Autowired
	PromoRepository promoRepository;
	@Autowired
	PromoCodeService promoCodeService;

	public static void main(String[] args) {
		SpringApplication.run(PromocodeApplication.class, args);
	}

}
