package com.endyary.patterns.structural;

import com.endyary.patterns.structural.composite.Box;
import com.endyary.patterns.structural.composite.BoxComponent;
import com.endyary.patterns.structural.composite.BoxItem;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class CompositeTest {

    @Test
    void boxCompositeTest() {
        BoxComponent item1 = new BoxItem("item1", "item1 desc");
        BoxComponent item2 = new BoxItem("item2", "item2 desc");

        BoxComponent box = new Box("Box name", "box desc");
        BoxComponent boxItem1 = new BoxItem("boxItem1", "boxItem1 desc");
        BoxComponent boxItem2 = new BoxItem("boxItem2", "boxItem2 desc");
        BoxComponent boxItem3 = new BoxItem("boxItem3", "boxItem3 desc");
        box.add(boxItem1);
        box.add(boxItem2);
        box.add(boxItem3);

        List<BoxComponent> allComponents = new ArrayList<>();
        allComponents.add(item1);
        allComponents.add(item2);
        allComponents.add(box);

        allComponents.forEach(BoxComponent::print);

        System.out.println(box.getChild(2).getName());
    }
}
