package com.company;
import java.util.Scanner;
public class replace {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string");
        String s1=sc.nextLine();
        char[] a=s1.toCharArray();
        System.out.println(a);
        int count=0;
        String space="";
        for(int i=0; i<a.length; i++){
            if(a[i] == ' '){
                count++;

            }
        }
        int n= a.length+ (count*2) ;
        System.out.println(n);
        char[] b=new char[n];
        for(int j=0;j<a.length;j++){
            if(a[j] == ' '){
                //System.out.println(j-1);
                b[j]='%';
                b[j+1]='2';
                b[j+2]='3';
//                j=j+3;
//                //System.out.println(j);
//                continue;
            }
            else{
               // System.out.println(a[j]);
                for(int m=0; m<b.length;m++){
                    if(b[m]==0){
                        b[m]=a[j];
                        break;
                    }
                    else System.out.println(b[m]);
                }
            }
        }
        for(int k=0; k<b.length; k++){
            System.out.print(b[k]);
        }

    }
}
