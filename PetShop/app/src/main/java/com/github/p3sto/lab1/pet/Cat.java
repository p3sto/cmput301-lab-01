package com.github.p3sto.lab1.pet;

import android.util.Log;

public class Cat extends Pet implements Pettable {

    public Cat(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "meow";
    }

    @Override
    public void pet() {
        Log.d("DEBUG", "You pet the cat");
    }
}
