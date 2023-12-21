//static data members
//if we create a variable as static, then its value for all objects of that class will be same. 
import java.util.Scanner;

class Student{
    int roll_no;
    String name;
    static String cName = "XYZ College";        //college name for multiple students can be same so we dont need to store the value separately for all objects. 
    
    //Student(int x, String y) is a parameterized constructor
    Student(int x, String y){
        roll_no = x;
        name = y;
    }
    void display(){
        System.out.println("Name = "+name+" and Roll number = "+roll_no+" and college name is: "+cName);
    }

} 

public class StaticDataMembers{
    public static void main(String[] args){
        Student s1 = new Student(001, "Ab");
        Student s2 = new Student(002, "cd");
        s1.display();
        s2.display();
    }
}
