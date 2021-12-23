package com.promo.promocode.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "Promo")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PromoCode {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "PromoID", nullable = false)
    private Long promoId;

    private String user;

  /*  @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "users_userid")
    private User users; */

}
