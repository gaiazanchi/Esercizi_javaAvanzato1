package it.develhope;

import java.util.Arrays;

public class Start {

    public static void main(String[] args) {

        String[] carBrands = new String[]{
                "Mercedes",
                "Fiat",
                "BMW",
                "Volkswagen",
                "Audi",
        };

        System.out.println("The length of the array is " + carBrands.length);
        System.out.println("This is the third item of the Array: " + carBrands[2]);

        int[] primeNumbers = new int[6];
        primeNumbers[0] = 2;
        primeNumbers[1] = 3;
        primeNumbers[2] = 5;
        primeNumbers[3] = 7;
        primeNumbers[4] = 11;
        primeNumbers[5] = 13;

        System.out.println("The arrive of prime numbers is: " + Arrays.toString(primeNumbers));

    }

}
