package co.yasmineoenning.APIRestSpringboot.domain.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity(name = "tb_card")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String cardNumber;
    @Column(name = "avaliable_limit", precision = 13, scale = 2)
    private BigDecimal cardLimit;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String number) {
        this.cardNumber = number;
    }

    public BigDecimal getCardLimit() {
        return cardLimit;
    }

    public void setCardLimit(BigDecimal limit) {
        this.cardLimit = cardLimit;
    }
}
