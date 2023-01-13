package it.develhope;

public class Main {

    public static void main(String[] args) {

        int count = 10;

        int num1 = 0;
        int num2 = 1;

        int i=1;

        while(i <= count){
            System.out.print(num1 + " ");
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
            i++;
        }

    }

}
