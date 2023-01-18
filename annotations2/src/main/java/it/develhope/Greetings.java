package it.develhope;

import java.lang.annotation.Annotation;

public class Greetings {

    @DevAnnotation(devName = "John", devSurname = "Walker")
    public static void sayWelcome(){
        System.out.println("Welcome!");
    }

    @DevAnnotation(devName = "Mark", devSurname = "Brown")
    public static void sayGoodbye(){
        System.out.println("Goodbye!");
    }

}
