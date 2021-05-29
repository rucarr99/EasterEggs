package com.cristi;

public class MoveToNorth implements IDirection {

    private IPosition position;

    @Override
    public void move() {
        position.decrementX();
    }

    @Override
    public IDirection next() {
        return new MoveToEast();
    }
}
