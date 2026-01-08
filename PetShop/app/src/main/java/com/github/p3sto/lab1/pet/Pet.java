package com.github.p3sto.lab1.pet;

import java.util.Date;

public abstract class Pet {
    private String name;
    private Date birthDate;

    public Pet(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public Pet(String name) {
        this(name, new Date());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public abstract String speak();
}
