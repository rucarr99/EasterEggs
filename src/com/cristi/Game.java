package com.cristi;

import java.util.ArrayList;

public class Game implements IGame {
    private int minutes;
    private ArrayList<IRabbit> rabbitsOnField;

    @Override
    public void start() {
        while(!isOver()) {
            increaseTime();
            moveRabbits();
        }
    }

    @Override
    public void moveRabbits() {
        for (IRabbit iRabbit : rabbitsOnField) {
            iRabbit.move();
        }
    }

    public void increaseTime() {
        minutes++;
    }
    public boolean isOver() {
        return rabbitsOnField.isEmpty();
    }
}
