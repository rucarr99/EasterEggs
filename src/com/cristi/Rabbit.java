package com.cristi;

public class Rabbit implements IRabbit {

    private IPosition position;
    private IDirection direction;
    private IBasket basket;

    public Rabbit(IPosition position, IDirection direction) {
        this.position = position;
        this.direction = direction;
    }

    @Override
    public void move() {
        direction.move();
    }

    @Override
    public void collectEgg(IEgg egg) {
        direction.next();
        basket.add(egg);
    }
}
