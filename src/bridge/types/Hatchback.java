package bridge.types;

import bridge.makers.Make;

public class Hatchback extends Car {

    public Hatchback(Make m) {
        super(m);
    }

    @Override
    public void showType() {
        System.out.println("Hatchback");
    }

}
