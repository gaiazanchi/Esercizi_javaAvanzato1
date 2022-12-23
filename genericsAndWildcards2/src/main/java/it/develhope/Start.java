package it.develhope;

public class Start {

    public static void main(String[] args) {

        GenericsClass<Integer> gc1 = new GenericsClass();
        gc1.setT(12);

        GenericsClass<Integer> gc2 = new GenericsClass();
        gc2.setT(13);

        GenericsClass<String> gc3 = new GenericsClass();
        gc3.setT("This is a String");

        GenericsClass<String> gc4 = new GenericsClass();
        gc4.setT("This is a String");

        System.out.println("First element is equal to second element? " + GenericsClass.isEqual(gc1, gc2));
        System.out.println("Third element is equal to fourth element? " + GenericsClass.isEqual(gc3, gc4));

    }

}
