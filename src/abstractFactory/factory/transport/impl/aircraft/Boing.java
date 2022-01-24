package abstractFactory.factory.transport.impl.aircraft;

import abstractFactory.transport.interfaces.Aircraft;

public class Boing implements Aircraft {
    @Override
    public void flight() {
        System.out.println("Boing flight");
    }
}
