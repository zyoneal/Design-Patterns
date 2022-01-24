package abstractFactory.factory.transport.impl.aircraft;

import abstractFactory.transport.interfaces.Aircraft;

public class TU134 implements Aircraft {

    @Override
    public void flight() {
        System.out.println("TU134 flight");
    }

}
