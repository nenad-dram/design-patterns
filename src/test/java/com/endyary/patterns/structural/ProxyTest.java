package com.endyary.patterns.structural;

import com.endyary.patterns.structural.proxy.MathOperations;
import com.endyary.patterns.structural.proxy.Operations;
import com.endyary.patterns.structural.proxy.ProxyOperations;
import org.junit.jupiter.api.Test;

public class ProxyTest {

    @Test
    void mathOperationsTest() {
        Operations mathOperations = new MathOperations();
        ProxyOperations proxyOperations = new ProxyOperations(mathOperations);

        proxyOperations.add(5, 4);
        proxyOperations.subtract(10, 3);
        proxyOperations.multiply(2, 4);
        proxyOperations.divide(6, 2);
    }
}
