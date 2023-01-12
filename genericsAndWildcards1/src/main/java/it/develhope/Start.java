package it.develhope;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Start {

    public static void main(String[] args) {

        Random random = new Random();

        List<Double> individualMarksListLisa = new ArrayList<>();
        individualMarksListLisa.add(random.nextDouble()*10);
        individualMarksListLisa.add(random.nextDouble()*10);

        List<Integer> projectsMarksListJeremy = new ArrayList<>();
        projectsMarksListJeremy.add(random.nextInt());
        projectsMarksListJeremy.add(random.nextInt());

        double lisaAv = Student.getAverageMark(individualMarksListLisa);
        double jeremyAv = Student.getAverageMark(projectsMarksListJeremy);

        List<Student> listOfStudents = new ArrayList<>();
        listOfStudents.add(new Student("Lisa", "Stuart",lisaAv));
        listOfStudents.add(new Student("Jeremy", "Green", jeremyAv));

        System.out.println(listOfStudents.get(0).toString());
        System.out.println(listOfStudents.get(1).toString());

    }

}
