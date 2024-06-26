package builder;

class LuxuryCarBuilder extends CarBuilder {
    @Override
    public void buildEngine() {
        car.setEngine("V6");
    }

    @Override
    public void buildTransmission() {
        car.setTransmission("Automatic");
    }

    @Override
    public void buildWheels() {
        car.setWheels(4);
    }

    @Override
    public void buildColor() {
        car.setColor("Black");
    }

    @Override
    public void buildSunroof() {
        car.setSunroof(true);
    }
}
