import java.util.Scanner;

public class Program1 {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        int n=s.length();
        int stop= n-k;
        int small=1000000000;
        int large=0;

        for(int i=0; i<=stop; i++){

            String s2=s.substring(i,i+k);
            int num1= (int) s2.charAt(0);
            if(num1<small){
                small=num1;
                smallest=s2;
            }
            if(num1>large){
                large=num1;
                largest=s2;
            }


        }
        // System.out.println(small);
        // System.out.println(large);
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}