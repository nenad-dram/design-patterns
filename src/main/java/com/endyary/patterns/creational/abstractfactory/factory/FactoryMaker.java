package com.endyary.patterns.creational.abstractfactory.factory;

public class FactoryMaker {
    public enum Surface {
        ROAD, WATER
    }

    public static TransporterFactory getFactory(Surface type) {
        return switch (type) {
            case ROAD -> RoadTransportFactory.create();
            case WATER -> WaterTransportFactory.create();
        };
    }
}
