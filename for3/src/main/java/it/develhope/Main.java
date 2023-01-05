package it.develhope;

public class Main {

    public static void main(String[] args) {

        String[] arr = {"monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"};

        for(int i = 0; i < arr.length; i+=2){
            arr[i] = arr[i].substring(0,1).toUpperCase() + arr[i].substring(1);
        }

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }

}
