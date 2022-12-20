package it.develhope;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Start {

    public static void main(String[] args) {

        String[] cityNames = new String[]{
                "Rome",
                "Los Angeles",
                "New York",
        };

        Arrays.asList(cityNames);

        //eccezione perchè l'array ha una dimensione limitata (index out of bounds)
        //cityNames[3] = "Milan";

        cityNames[1] = "Tegucigalpa";

        System.out.println("The cities are: " + Arrays.toString(cityNames));

        List<String> kingsOfRome = new ArrayList<>(7);
        kingsOfRome.add("Romolo");
        kingsOfRome.add("Numa Pompilio");
        kingsOfRome.add("Tullo Ostilio");
        kingsOfRome.add("Anco Marzio");
        kingsOfRome.add("Tarquinio Prisco");
        kingsOfRome.add("Servio Tullio");
        kingsOfRome.add("Tarquinio il Superbo");

        System.out.println("The kings of Rome: " + kingsOfRome);

        String[] kingsOfRomeArray = kingsOfRome.toArray(new String[0]);
        kingsOfRomeArray[6] = "Lucius Tarquinius Supercar";

        System.out.println("The array of kings is: " + Arrays.toString(kingsOfRomeArray));

    }

}
