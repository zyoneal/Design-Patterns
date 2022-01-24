package bridge;

import bridge.makers.Kia;
import bridge.types.Car;
import bridge.types.Sedan;

// Мост позволяет разделить имплементацию от ее абстракции, таким образом
//реализация может быть изменена отдельно от абстракции, поскольку она не
//наследуется от нее напрямую.

public class BridgeApp {

    public static void main(String[] args) {
        Car car = new Sedan(new Kia());
        car.showDetails();
    }

}
