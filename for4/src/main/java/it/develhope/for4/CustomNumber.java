package it.develhope.for4;

public class CustomNumber {

    int number;

    public CustomNumber(){
        number = (int) Math.round(Math.random()*12);
        System.out.println(number);
    }

    public void getMultiplicationTable(){
        for(int i = 12; i >= 0; i--){
            System.out.println(number + " x " + i + " = " + number*i);
        }
    }

}
