package com.cristi;

public class MoveToSouth implements IDirection {

    IPosition position;

    @Override
    public void move() {
        position.incrementX();
    }

    @Override
    public IDirection next() {
        return new MoveToWest();
    }
}
