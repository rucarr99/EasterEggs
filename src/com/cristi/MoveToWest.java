package com.cristi;

public class MoveToWest implements IDirection {

    IPosition position;

    @Override
    public void move() {
        position.incrementY();
    }

    @Override
    public IDirection next() {
        return new MoveToNorth();
    }
}
