package abstractFactory.factory.impl;

import abstractFactory.factory.interfaces.TransportAbstractFactory;
import abstractFactory.factory.transport.impl.aircraft.Boing;
import abstractFactory.factory.transport.impl.car.Porsche;
import abstractFactory.transport.interfaces.Aircraft;
import abstractFactory.transport.interfaces.Car;

public class AmericanFactory implements TransportAbstractFactory {

    @Override
    public Car createCar() {
        return new Porsche();
    }

    @Override
    public Aircraft createAircraft() {
        return new Boing();
    }

}
