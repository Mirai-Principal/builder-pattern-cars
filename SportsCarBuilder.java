package builder;

class SportsCarBuilder extends CarBuilder {
    @Override
    public void buildEngine() {
        car.setEngine("V8");
    }

    @Override
    public void buildTransmission() {
        car.setTransmission("Manual");
    }

    @Override
    public void buildWheels() {
        car.setWheels(4);
    }

    @Override
    public void buildColor() {
        car.setColor("Red");
    }

    @Override
    public void buildSunroof() {
        car.setSunroof(false);
    }
}
