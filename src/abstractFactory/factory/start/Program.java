package abstractFactory.factory.start;

import abstractFactory.factory.impl.RussianFactory;
import abstractFactory.factory.interfaces.TransportAbstractFactory;
import abstractFactory.transport.interfaces.Aircraft;

//Абстрактная Фабрика предоставляет простой интерфейс для создания объектов,
//принадлежащие к тому или иному семейству.

// Использовать когда есть много разных типов одних обьектов
// Например игрушки: мягкие, деревянные
// Машины: Русские, Американские

public class Program {

    public static void main(String[] args) {
        TransportAbstractFactory russianFactory = new RussianFactory();
        Aircraft aircraft = russianFactory.createAircraft();
        aircraft.flight();
    }

}
