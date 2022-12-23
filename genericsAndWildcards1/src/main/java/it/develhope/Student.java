package it.develhope;

import java.util.List;

public class Student {

    String studentName;
    String studentSurname;
    double marksAverage;

    public Student(String name, String surname, double average){
        this.studentName = name;
        this.studentSurname = surname;
        this.marksAverage = average;
    }

    public static double getAverageMark(List<? extends Number> listOfMarks){
        double sum = 0.0;
        for(int i = 0; i < listOfMarks.size(); i++){
            sum += listOfMarks.get(i).doubleValue();
        }
        return sum/listOfMarks.size();
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name ='" + studentName + '\'' +
                ", Surname ='" + studentSurname + '\'' +
                ", Average = " + marksAverage +
                '}';
    }
}
