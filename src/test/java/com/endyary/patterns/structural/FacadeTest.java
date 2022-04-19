package com.endyary.patterns.structural;

import com.endyary.patterns.structural.facade.Coffee;
import com.endyary.patterns.structural.facade.CoffeeMaker;
import com.endyary.patterns.structural.facade.Milk;
import com.endyary.patterns.structural.facade.Sugar;
import com.endyary.patterns.structural.facade.Water;
import org.junit.jupiter.api.Test;

public class FacadeTest {
    
    @Test
    void coffeeMakerTest() {
        Coffee coffee = new Coffee();
        Water water = new Water();
        Milk milk = new Milk();
        Sugar sugar = new Sugar();

        CoffeeMaker coffeeMaker = new CoffeeMaker(coffee, water, milk, sugar);
        coffeeMaker.makeWithMilkAndSugar();
    }
}
