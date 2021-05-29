package com.cristi;

public class MoveToEast implements IDirection {

    private IPosition position;

    @Override
    public void move() {
        position.decrementY();
    }

    @Override
    public IDirection next() {
        return new MoveToSouth();
    }
}
