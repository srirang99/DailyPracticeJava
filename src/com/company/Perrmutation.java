package com.company;
import java.util.Scanner;
public class Perrmutation {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word");
        String s= sc.next();
        System.out.println("Enter another word");
        String s2= sc.next();
        int n=s.length();
        int n2=s2.length();
        int count=0;
        int num=99999;
        if(n==n2){
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++) {
                    if(j==num){
                        continue;
                    }
                    char a = s.charAt(i);
                    char b = s2.charAt(j);
                    if (a == b) {
                        count=count+1;
                        num=j;
                        break;

                    }
                }
                }
        }
        if(count==n){
//            System.out.println(count);
            System.out.println("It is permutation");
        }
        else{
//            System.out.println(count);
            System.out.println("Not a permutation");
        }


    }
}
