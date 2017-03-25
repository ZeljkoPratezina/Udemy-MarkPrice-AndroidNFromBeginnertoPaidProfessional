package com.example;

public class JavaArrays {

    public static void main(String[] args) {


        //Tom (play baseball)
       /* int game1 = 250;
        int game2 = 400;
        int game3 = 600;*/

        int[] tomsAverages = new int[3];
        double[] dblArray;
        String[] names;
        names = new String[5];
        names[0] = "John";
        names[1] = "Jacob";
        names[2] = "Jingle";
        names[3] = "Heimer";
        names[4] = "Smith";

        tomsAverages[0] = 250;
        tomsAverages[1] = 400;
        tomsAverages[2] = 600;

        System.out.println("Val 1: "+ tomsAverages[0]);
        System.out.println("Val 2: "+ tomsAverages[1]);
        System.out.println("Val 3: "+ tomsAverages[2]);

        tomsAverages[0] = 100;
        System.out.println(tomsAverages[0]);

        String[] top5Cars = {
                "GTR" , "AstonMartin" , "Chevy Pinto" ,
                "Jaugar" , "BMW"  };

        System.out.println(top5Cars[0]);
        System.out.println(top5Cars[1]);
        System.out.println(top5Cars[2]);
        System.out.println(top5Cars[3]);
        System.out.println(top5Cars[4]);

        System.out.println("Total cars: "+top5Cars.length);
        System.out.println("Last car: " +top5Cars[(top5Cars.length - 1)]);
    }
}
