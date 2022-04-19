package com.endyary.patterns.structural;

import com.endyary.patterns.structural.adapter.Human;
import com.endyary.patterns.structural.adapter.HumanAdapter;
import com.endyary.patterns.structural.adapter.HumanExample;
import com.endyary.patterns.structural.adapter.Person;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class AdapterTest {

    @Test
    void humanAdapterTest() {
        Human human = new HumanExample("John Doe", LocalDate.of(1970, 1, 1));

        Person adaptedHuman = new HumanAdapter(human);
        adaptedHuman.sayHello();
        adaptedHuman.walk();
    }
}
