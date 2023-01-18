package it.develhope;

public class Car {

    String modelName;
    int mileage;

    public Car(String modelName, int mileage){
        this.modelName = modelName;
        this.mileage = mileage;
    }

    @Deprecated
    public void printCarDetails(){
        System.out.println("Model of the car: " + modelName +", mileage: " + mileage + " km");
    }

    public void getCarDetails(){
        System.out.println("Model of the car: " + modelName);
        System.out.println("Mileage: " + mileage + " km");
    }

}
