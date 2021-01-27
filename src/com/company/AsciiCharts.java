package com.company;

public class AsciiCharts {
    public static void  printNumbers(){
        for (int i = 0; i< 10; i++){
            System.out.println("The valid numbers " + i + " is " );
        }
    }
    public static void printUpperCase(){
        for ( char i = 65; i <= 90; i++)  {
            System.out.println("The valid characters  " + i  + " is " );
        }

    }
   public static void  printLowerCaseLetter(){
        for (char i = 97; i<= 122; i++){
            System.out.println("The valid characters " + i + " is " );
       }
   }
}
