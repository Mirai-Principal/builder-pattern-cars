package builder;

public class Car {
    private String engine;
    private String transmission;
    private int wheels;
    private String color;
    private boolean sunroof;

    // Métodos setter solo accesibles desde el builder
    void setEngine(String engine) {
        this.engine = engine;
    }

    void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    void setWheels(int wheels) {
        this.wheels = wheels;
    }

    void setColor(String color) {
        this.color = color;
    }

    void setSunroof(boolean sunroof) {
        this.sunroof = sunroof;
    }

    @Override
    public String toString() {
        return "Car with engine: " + engine + ", transmission: " + transmission +
               ", wheels: " + wheels + ", color: " + color + ", sunroof: " + sunroof;
    }
}
