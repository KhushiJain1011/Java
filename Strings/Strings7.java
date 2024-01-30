//compareTo function in JAVA
//- compares two strings
//- returns 0 if  string1 = string2
//- returns >0 (positive value) if string1 > string2
//- returns <0 (negative value) if string1 < string2

import java.util.Scanner;
public class Strings7 {
    public static void main(String[] args){
        String s1 = new String();
        String s2 = new String();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st stringg: ");
        s1 = sc.nextLine();
        System.out.println("Enter 2nd stringg: ");
        s2 = sc.nextLine();
        if(s1.compareTo(s2) == 0){
            System.out.println("Equal strings");
        }
        else if(s1.compareTo(s2)>0){
            System.out.println("s1 is greater ");
        }
        else{
            System.out.println("s2 is greater than s1");
        }


        // Scanner sc = new Scanner(System.in);
        // String s1 = "hello";
        // String s2 = "hello";
        // String s3 = "meklo";
        // String s4 = "hemlo";
        // String s5 = "flag";

        // System.out.println(s1.compareTo(s2));
        // System.out.println(s1.compareTo(s3));
        // System.out.println(s1.compareTo(s4));
        // System.out.println(s1.compareTo(s5));
    }
}
