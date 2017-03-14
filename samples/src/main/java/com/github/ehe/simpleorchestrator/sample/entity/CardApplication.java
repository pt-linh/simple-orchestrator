/*
 * Copyright (c) 2017. Eric He (eriche39@gmail.com)
 *
 * This software is licensed under
 *
 * MIT license
 *
 */

package com.github.ehe.simpleorchestrator.sample.entity;

/**
 * Created by eric on 3/12/17.
 */
public class CardApplication {
    private Person person;
    private String occupation;
    private boolean employed;
    private CardType cardType;

    public CardApplication(Person person, String occupation, boolean employed, CardType cardType) {
        this.person = person;
        this.occupation = occupation;
        this.employed = employed;
        this.cardType = cardType;
    }

    public CardApplication() {
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public boolean isEmployed() {
        return employed;
    }

    public void setEmployed(boolean employed) {
        this.employed = employed;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    public static enum CardType{
        Credit, Debit
    }
}