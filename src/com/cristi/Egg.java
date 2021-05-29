package com.cristi;

public class Egg implements IEgg {
    int value;
    IPosition position;

    public Egg(int value, IPosition position) {
        this.value = value;
        this.position = position;
    }

    public int getValue() {
        return value;
    }
}
