package com.github.p3sto.lab1.pet;

public class Scorpion extends Pet {

    public Scorpion(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "hiss";
    }
}
