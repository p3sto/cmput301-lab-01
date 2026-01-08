package com.github.p3sto.lab1.mood;

import java.util.Date;

public class Sad extends Mood{

    public Sad() {
    }

    public Sad(Date date) {
        super(date);
    }

    @Override
    public String name() {
        return "sad";
    }
}
