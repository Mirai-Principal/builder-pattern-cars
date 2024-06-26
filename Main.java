package builder;

public class Main {
    public static void main(String[] args) {
        CarBuilder sportsCarBuilder = new SportsCarBuilder();
        CarDirector sportsCarDirector = new CarDirector(sportsCarBuilder);
        Car sportsCar = sportsCarDirector.constructCar();
        System.out.println(sportsCar);

        CarBuilder luxuryCarBuilder = new LuxuryCarBuilder();
        CarDirector luxuryCarDirector = new CarDirector(luxuryCarBuilder);
        Car luxuryCar = luxuryCarDirector.constructCar();
        System.out.println(luxuryCar);
    }
}
