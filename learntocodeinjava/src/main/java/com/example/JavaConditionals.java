package com.example;

/**
 * Created by ZELJKO on 3/24/2017.
 */

public class JavaConditionals {

    public static void main(String[] args) {

        if (1 == 1){
            System.out.println("One equals one");
        }
        if (1 != 1){
            System.out.println("One is not equal to one");
        }
        int accountBalance = 100;
        int itemPrice = 250;

        if(accountBalance >= itemPrice){
            System.out.println("You have purchased the item!");
        }else{
            System.out.println("You do not have enough money. Get a job!");
        }

        int degrees = -10;
        if (degrees >= 70){
            System.out.println("Put on some sunblock!");
        }else if(degrees < 70 && degrees >= 59){
            System.out.println("You might need a sweater!");
        }else {
            System.out.println("Put on heavy coat!");
        }

        boolean firstTimeCostumer = false;
        boolean isExecutiveMember = true;

        if (firstTimeCostumer == true || isExecutiveMember == true){
            System.out.println("You received 10% discount!");
        }

        if(firstTimeCostumer || isExecutiveMember){
            System.out.println("You received 10% discount!");
        }


        if (true == true || false == true && false == true){
            //Will this be called?   true || false && false =  true && false = false
            System.out.println("1. Did this print?");
        }
        if (false == true && true == true || false == false && true == true && true == false){
            //Will this be called?  false && true || true && true && false = false || true && true && false = true && true && false = true && false = false
            System.out.println("2. Did this print?");
        }
    }
}
