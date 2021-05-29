package com.cristi;

public class Position implements IPosition {
    private int x;
    private int y;

    @Override
    public void decrementX() {
        x--;
    }

    @Override
    public void incrementX() {
        x++;
    }

    @Override
    public void decrementY() {
        y--;
    }

    @Override
    public void incrementY() {
        y++;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}

