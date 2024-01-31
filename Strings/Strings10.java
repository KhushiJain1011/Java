//printing short names:
//example: ram kumar verma => r. k. verma
import java.util.Scanner;
public class Strings10 {
    public static void main(String[] args){
        String str1 = new String();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        str1 = sc.nextLine();
        int i, j;
        char c, d;
        i = str1.length() - 1;
        while(str1.charAt(i)!=' ')
            i--;
            j = 0;
            while(j<i){
                if(j==0){
                    System.out.print(str1.charAt(j)+".");
                }
                else{
                    c = str1.charAt(j);
                    d = str1.charAt(j+1);
                    if(c==' ' && d!=' ')
                        System.out.print(d+".");
                    
                }
                j++;
            }
            System.out.println(str1.substring(i));
        
    }
}
