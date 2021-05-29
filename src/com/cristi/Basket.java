package com.cristi;

import java.util.List;

public class Basket implements IBasket {
    List<IEgg> listOfEggs;
    int basketValue;

    public Basket() {
        basketValue = 0;
    }

    public void add(IEgg egg) {
        listOfEggs.add(egg);
    }

    public int computeValue() {
        for (IEgg listOfEgg : listOfEggs) {
            basketValue += listOfEgg.getValue();
        }
        return basketValue;
    }
}
