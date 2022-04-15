package com.endyary.patterns.behavioral;

import com.endyary.patterns.behavioral.strategy.DeliveryMethod;
import com.endyary.patterns.behavioral.strategy.Order;
import com.endyary.patterns.behavioral.strategy.PersonalDelivery;
import com.endyary.patterns.behavioral.strategy.ShopPickup;
import org.junit.jupiter.api.Test;

public class StrategyTest {

    @Test
    void deliveryStrategyTest() {
        DeliveryMethod shopPickup = new ShopPickup();
        Order orderShop = new Order(shopPickup);

        DeliveryMethod personalDelivery = new PersonalDelivery();
        Order orderPersDelivery = new Order(personalDelivery);

        orderShop.doDelivery();
        orderPersDelivery.doDelivery();
    }
}
