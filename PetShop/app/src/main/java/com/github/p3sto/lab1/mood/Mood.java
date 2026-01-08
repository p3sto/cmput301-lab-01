package com.github.p3sto.lab1.mood;

import java.util.Date;

public abstract class Mood {
    private Date date;

    public Mood() {
        this(new Date());
    }

    public Mood(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public abstract String name();
}