package abstractFactory.factory.interfaces;

import abstractFactory.transport.interfaces.Aircraft;
import abstractFactory.transport.interfaces.Car;

// фабрика по созданию транспортных средств
// когда нужно создавать разные семейства обьектов в одном месте
public interface TransportAbstractFactory {

    Car createCar();

    Aircraft createAircraft();

}
