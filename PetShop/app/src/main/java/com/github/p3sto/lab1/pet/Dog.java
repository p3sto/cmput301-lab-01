package com.github.p3sto.lab1.pet;

import android.util.Log;

public class Dog extends Pet implements Pettable {

    public Dog(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "bark";
    }

    @Override
    public void pet() {
        Log.d("DEBUG", "You pet the cat");
    }
}
