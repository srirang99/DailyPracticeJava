package com.company;

import java.util.Scanner;


public class DriverClass
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         for(int i=0; i<10; i++){
             if (i == 5) {
                 continue;
             }
             System.out.println( i);
         }



    }
}
