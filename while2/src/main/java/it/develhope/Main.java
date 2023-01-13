package it.develhope;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String inserted = "";

        while(!(inserted.equalsIgnoreCase("stop"))){
            System.out.println("Please enter a command:");
            inserted = scanner.nextLine();
            System.out.println("You entered: \"" + inserted + "\"");
        }

    }

}
