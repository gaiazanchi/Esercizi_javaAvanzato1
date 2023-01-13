package it.develhope;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int inserted = 0;
        int number = (int)Math.round((Math.random()*10)+1);

        System.out.println("Welcome!");

        while(inserted != number){
            System.out.println("Guess the integer number!");
            inserted = scanner.nextInt();
            scanner.nextLine();
        }

        System.out.println("Congratulations!");

    }

}
