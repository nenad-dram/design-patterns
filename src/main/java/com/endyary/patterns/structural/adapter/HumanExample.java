package com.endyary.patterns.structural.adapter;

import java.time.LocalDate;

public class HumanExample implements Human {
    private String firstNameLastName;
    private LocalDate birthdate;

    public HumanExample(String firstNameLastName, LocalDate birthdate) {
        this.firstNameLastName = firstNameLastName;
        this.birthdate = birthdate;
    }

    @Override
    public void introduceYourself() {
        System.out.println("I'm " + this.firstNameLastName + ", and my date of birth is " + this.birthdate);
    }

    @Override
    public void move() {
        System.out.println("Step by step...");
    }
}
