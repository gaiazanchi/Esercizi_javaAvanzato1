package it.develhope;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Start {

    public static void main(String[] args) {

        List<Integer> divisorsOf52 = new ArrayList<>();
        for(int i = 2; i <= 52; i++){
            if(52 % i == 0){
                divisorsOf52.add(i);
            }
        }

        List<Integer> randomNumbers = new ArrayList<>(4);
        randomNumbers.add(1);
        randomNumbers.add(60);
        randomNumbers.add(13);
        randomNumbers.add(12);

        randomNumbers.addAll(divisorsOf52);

        System.out.println("The array randomNumbers: " + randomNumbers);
        System.out.println("The length of the array randomNumbers is " + randomNumbers.size());


        randomNumbers = randomNumbers.stream().distinct().collect(Collectors.toList());

        System.out.println("The array randomNumbers: " + randomNumbers);
        System.out.println("The length of the array randomNumbers is " + randomNumbers.size());


        randomNumbers.sort(Comparator.reverseOrder());

        System.out.println("The array randomNumbers: " + randomNumbers);

    }

}
