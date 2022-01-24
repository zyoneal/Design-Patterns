package abstractFactory.factory.impl;

import abstractFactory.factory.interfaces.TransportAbstractFactory;
import abstractFactory.factory.transport.impl.aircraft.TU134;
import abstractFactory.factory.transport.impl.car.Niva;
import abstractFactory.transport.interfaces.Aircraft;
import abstractFactory.transport.interfaces.Car;

public class RussianFactory implements TransportAbstractFactory {

    @Override
    public Car createCar() {
        return new Niva();
    }

    @Override
    public Aircraft createAircraft() {
        return new TU134();
    }

}
