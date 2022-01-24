package bridge.types;

import bridge.makers.Make;

public class Sedan extends Car {

    public Sedan(Make m) {
        super(m);
    }

    @Override
    public void showType() {
        System.out.println("Sedan");
    }

}
