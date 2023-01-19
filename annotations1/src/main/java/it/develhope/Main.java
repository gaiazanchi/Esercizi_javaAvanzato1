package it.develhope;

public class Main {

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {

        Car car = new Car("Cabrio", 100000);
        car.printCarDetails();
        car.getCarDetails();

    }

}