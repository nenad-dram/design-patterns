package com.endyary.patterns.structural;

import com.endyary.patterns.structural.decorator.DoubleBedroom;
import com.endyary.patterns.structural.decorator.ParingLot;
import com.endyary.patterns.structural.decorator.PetFee;
import com.endyary.patterns.structural.decorator.Room;
import org.junit.jupiter.api.Test;

public class DecoratorTest {

    @Test
    void roomDecoratorTest() {
        Room doubleBedroom = new DoubleBedroom();
        doubleBedroom = new PetFee(doubleBedroom);
        doubleBedroom = new ParingLot(doubleBedroom);

        System.out.println(doubleBedroom.description());
        System.out.println(doubleBedroom.cost());

    }
}
