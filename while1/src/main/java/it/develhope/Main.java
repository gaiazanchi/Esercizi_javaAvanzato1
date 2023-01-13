package it.develhope;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args){

        while(true){
            try{
                TimeUnit.SECONDS.sleep(1);
            }catch(Exception e){
                System.out.println("Error");
            }
            System.out.println("I am in loop!");
        }

    }

}
