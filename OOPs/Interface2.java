//multiple inheritance using concept of interface

class Student{
    int roll; 
    void getRoll(int n){
        roll=n;
    }
    void putRoll(){
        System.out.println("Roll number = "+roll);
    }
}

class test extends Student{
    float mark1, mark2;
    void getMarks(float m1, float m2){
        mark1 = m1;
        mark2 = m2;
    }
    void putMarks(){
        System.out.println("Marks 1 = "+mark1+"\nMarks 2 = "+mark2);
    }
}
interface Sports{
    float sportMark = 6.0F;
    void putSport();
}
class result extends test implements Sports{
    float total;
    public void putSport(){
        System.out.println("Sports marks = "+sportMark);
    }
    void display(){
        total = mark1 + mark2 +sportMark;
        putRoll();
        putMarks();
        putSport();
        System.out.println("Total marks = "+total);
    }
}

public class Interface2 {
    public static void main(String[] args){
        result aa = new result();
        aa.getRoll(10);
        aa.getMarks(30.5F, 35.9F);
        aa.display();
    }
}
