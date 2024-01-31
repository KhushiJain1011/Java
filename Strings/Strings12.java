//string buffer class
// 1) setCharAt(n, 'character') => {n is index} - this function replaces nth index character with given character
// 2) append => appends the 2nd string in 1st string 
//      str1.append(str2)
// 3) insert => str1.insert(n, str2)
// 4) setLength() => str1.setLength(20)

import java.util.Scanner;
public class Strings12 {
    public static void main(String[] args){
        StringBuffer str = new StringBuffer();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        str.append(sc.nextLine());
        str.setCharAt(3, 'u');
        System.out.println(str);
        str.insert(3, "ABCD");
        System.out.println(str);
        str.setLength(20);      //we can also reduce the length
        System.out.println(str);
    }
}
