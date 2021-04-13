package com.company;
import java.util.Scanner;
public class Permutation2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word");
        String s= sc.next();
        System.out.println("Enter another word");
        String s2= sc.next();
        int n=s.length();
        int count=0;
        char[] ar= new char[n];
        char[] ar2= new char[n];
        for(int i=0;i<n; i++){
            ar[i]=s.charAt(i);
            ar2[i]=s2.charAt(i);
            }
//        System.out.println(ar);
//        System.out.println(ar2);
        for(int j=0; j<n; j++){
            for(int k=0;k<n;k++) {
//                System.out.println(j);
//                System.out.println(ar[j]);
//                System.out.println(ar2[k]);
                if (ar[j] == ar2[k]) {
                    ar2[k] = 0;
                    count = count + 1;
                    break;
                }
            }
        }
        if(count==n){
//            System.out.println(count);
//            System.out.println(ar2);
            System.out.println("permutation");
        }
        else{
//            System.out.println(ar2);
//            System.out.println(count);
            System.out.println("not a permutation");
        }
    }

}
