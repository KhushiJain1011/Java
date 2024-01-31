//string functions in java
// 1) subString(n) => returns a substring from nth index
// 2) subString(n, m) => returns a substring from nth index to mth index (not including m)
// 3) concat() => concatenates 2 different strings into a single string
// 4) indexOf('X') => returns the index of given character in a string
// 5) indexOf('X', n) => returns the index of character after nth position. 



import java.util.Scanner;
public class Strings9 {
    public static void main(String[] args){
        String str1 = new String();
        String str2 = new String();
        int i, j;  //i gives the position for functions
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string 1: ");
        str1 = sc.nextLine();
        System.out.println("Enter string 2: ");
        str2 = sc.nextLine();
        //function 1: 
        System.out.println("Enter position: ");
        i = sc.nextInt();
        System.out.println(str1.substring(i));
        //function 2: 
        System.out.println("enter position 2: ");
        j = sc.nextInt();
        System.out.println(str1.substring(i, j));
        //function 3: 
        System.out.println(str1.concat(str2));
        //function 4: 
        System.out.println(str2.indexOf('i'));
        //function 5: 
        System.out.println(str1.indexOf('i', 4));
    }
}
