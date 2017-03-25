package com.example;

/**
 * Created by ZELJKO on 3/25/2017.
 */

public class methods {
    public static void main(String[] args) {
        printName();
        int len = 5;
        int wid = 10;

        printArea(len,wid);
        int Area = getArea(5,6);
    }

    public static void printName() {

        System.out.println("Hello my name is Enrique, but my friends call me Henry.");
    }

    public static void printArea(int lenght, int width){

        System.out.println("Area: "+ (lenght * width));
    }

    public static int getArea(int length, int width) {

        int area = length * width;
        return area;
    }
}
//printName, getArea, printArea is function name
//between precentes () is where we define our parameters or arguments (type and name of variable )
//void means there's nothing to return, unless we write type of return like (int, double ... ),
//so void return nothing, int return only int value etc.
//static means there is only one instance of this function
//Public means that anyone can google it
//Private means that Nobody can't access the functions, except those  inside the the same class
//Protected means you do not want outside world to have acces to,
// but anything inside the same java package , or children classes