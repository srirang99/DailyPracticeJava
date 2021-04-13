package com.company;
import java.util.Scanner;

public class FibonacciSeries {
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=s.length();
        for(int i=0; i<n; i++){
            if(i==n-1){
                System.out.println("Unique");
                break;
            }
            for(int j=i+1; j<n; j++){
                char a=s.charAt(i);
                char b=s.charAt(j);
                if(a==b){
                    System.out.println("not unique");
                    break;
                }

            }
        }
    }


}
