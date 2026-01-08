package com.github.p3sto.lab1.mood;

import java.util.Date;

public class Happy extends Mood {

    public Happy() {
    }

    public Happy(Date date) {
        super(date);
    }

    @Override
    public String name() {
        return "happy";
    }
}
