package it.develhope;

public class Main {

    public static void chechScore(double score){

        if(0.0 < score && score <= 50.0){
            System.out.println("Average score!");
        }else if(50.0 < score && score <= 100.0 ){
            System.out.println("Very good score!");
        }else{
            throw new ArithmeticException("Score is out of scale!");
        }
    }

    public static void main(String[] args) {
        chechScore(2.15);
        chechScore(50);
        chechScore(95.02);
        try{
            chechScore(100.01);
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }


    }

}
/*
-define a method checkScore that takes a double score as input parameter
-if 0 < score <= 50.00 then print Average score
-if 50.00 < score <= 100.00 the print Very good score
-in all other cases throw an ArithmeticException with the message Score is out of scale!
-test the method with the following values:
    2.15
    50
    95.02
    100.01
 */
