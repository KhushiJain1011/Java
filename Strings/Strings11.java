//reverse each word of the string:

import java.util.Scanner;
public class Strings11 {
    public static void main(String[] args){
        String str = new String();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string: ");
        str = sc.nextLine();
        int i, j, k; 
        i=str.length()-1;
        while(i>=0){
            j = i;
            while(str.charAt(j)!=' ' && j>0)
                j--;
            if(j==0)
            k=0;
            else{
                k = j+1;
            }
            System.out.print(str.substring(k, i+1)+" ");
            i = j-1;
        }
    }
}
