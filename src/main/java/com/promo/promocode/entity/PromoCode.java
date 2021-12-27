package com.promo.promocode.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "promo")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PromoCode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long promoId;
    @Column(name = "user_id")
    private String userId;
    @Column(name="promocode")
    private String promoCode;

}
