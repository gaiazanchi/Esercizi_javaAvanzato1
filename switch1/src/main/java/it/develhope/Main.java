package it.develhope;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;

        while(true){
            System.out.println("Inserisci un numero intero compreso fra 1 e 10:");
            number = scanner.nextInt();
            scanner.nextLine();

            switch(number){
                case 1:
                    System.out.println(number + " -> one");
                    break;
                case 2:
                    System.out.println(number + " -> two");
                    break;
                case 3:
                    System.out.println(number + " -> three");
                    break;
                case 4:
                    System.out.println(number + " -> four");
                    break;
                case 5:
                    System.out.println(number + " -> five");
                    break;
                case 6:
                    System.out.println(number + " -> six");
                    break;
                case 7:
                    System.out.println(number + " -> seven");
                    break;
                case 8:
                    System.out.println(number + " -> eight");
                    break;
                case 9:
                    System.out.println(number + " -> nine");
                    break;
                case 10:
                    System.out.println(number + " -> ten");
                    break;
                default:
                    System.out.println("Cannot give you the name!");
            }

        }

    }

}
