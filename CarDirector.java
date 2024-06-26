package builder;

class CarDirector {
    private CarBuilder builder;

    public CarDirector(CarBuilder builder) {
        this.builder = builder;
    }

    public Car constructCar() {
        builder.createNewCar();
        builder.buildEngine();
        builder.buildTransmission();
        builder.buildWheels();
        builder.buildColor();
        builder.buildSunroof();
        return builder.getCar();
    }
}
