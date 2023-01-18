package it.develhope;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int dividend;
        int divisor;

        while(true){
            System.out.println("Inserisci due interi, premi enter dopo ognuno: (dividendo e poi divisore)");

            dividend = scanner.nextInt();

            divisor = scanner.nextInt();

            if(divisor != 0){
                System.out.println((double)dividend/divisor);
            }else{
                System.out.println("It's not possible to divide by zero!");
            }

        }

    }

}
/*
continue to ask the user to input two integers:
dividend
divisor
execute the division and print the quotient
if the user inputs divisor==0, alert the user that is not possible to divide by zero
 */