package it.develhope;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String inserted = "";

        while(true){
            System.out.println("Inserisci uno stringa:");
            inserted = scanner.nextLine();

            switch(inserted){
                case "size":
                    System.out.println("The size of the list is " + list.size());
                    break;
                case "clear":
                    System.out.println("I'm removing all the elements from the list");
                    list.clear();
                    break;
                case "print":
                    System.out.println("I'm printing the list:\n" + list);
                    break;
                default:
                    System.out.println("I'm adding what you inserted to the list");
                    list.add(inserted);
                    break;
            }
        }

    }

}
