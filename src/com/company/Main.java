package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        AsciiCharts.printNumbers();
        AsciiCharts.printUpperCase();
        AsciiCharts.printLowerCaseLetter();
// Part 1 above


            //If-else statement with user input

// Part 2 below
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter your name: ");
         String userName= userInput.next();

        System.out.println("Hello " + userName);
        System.out.println("Do you wish to continue with the interactive portion?");
        String continued = userInput.next();


        //LL Exercise Below

            // Switch Case example
        //Still don't understand what's it does.

//        var now = LocalDateTime.now();
//        var monthNumber = now.getMonthValue();
//
//        switch (monthNumber) {
//            case 1:
//                System.out.println("The month is January");
//                break;
//            case 2:
//                System.out.println("The month is February");
//                break;
//            case 3:
//                System.out.println("The month is March");
//                break;
//            case 9:
//            case 10:
//            case 11:
//                System.out.println("It's the 4th quarter");
//                break;
//            default:
//                System.out.println("You chose another month");
//        }

        // Working with Loops
//        String[] months =
//                {"January", "February", "March", "April",
//                        "May", "June", "July", "August", "September",
//                        "October", "November", "December" };

              // one way to create a loop
////        for (int i = 0; i < months.length; i++) {
////            System.out.println(months[i]);
//
//        }
            // Another way to create a loop
//        for (String month : months) {
//            System.out.println(month);
//        }



    }
}
