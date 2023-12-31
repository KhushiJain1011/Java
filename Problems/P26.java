//P26. Write a Java program to add two binary numbers. Go to the editor
// Input Data:
// Input first binary number: 10
// Input second binary number: 11
// Expected Output
//Sum of two binary numbers: 101

import java.util.Scanner;
public class P26 {
    public static void main(String[] args){
        long bin1, bin2;
        int i=0, rem=0;
        int[] sum = new int[20];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st binary number: ");
        bin1 = sc.nextLong();
        System.out.println("Enter 2nd number: ");
        bin2 = sc.nextLong();

        while(bin1!=0 || bin2!=0){
            sum[i++] = (int)((bin1%10 + bin2%10 + rem)%2);
            i++;
            rem = (int)((bin1%10 + bin2%10 + rem)/2);
            bin1 = bin1/10;
            bin2 = bin2/10;
            //i++;
        }
        if(rem!=0){
            sum[i++] = rem;
        }
        --i;

        while(i>=0){
            System.out.print(sum[i--]);
        }
        System.out.println();
    }
}
