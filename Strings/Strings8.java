//converting a string to uppercase or lowercase using functions toUpperCase() and toLowerCase()
import java.util.Scanner;
public class Strings8 {
    public static void main(String[] args){
        String str1 = new String();
        String str2 = new String();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string in lowercase: ");
        str1 = sc.nextLine();
        System.out.println("String in uppercase is : "+str1.toUpperCase());
        System.out.println("Enter string in uppercase: ");
        str2 = sc.nextLine();
        System.out.println("String in lowercase is : "+str2.toLowerCase());
    }
}
