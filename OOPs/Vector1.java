//vectors in java
import java.util.*;
public class Vector1 {
    public static void main(String[] args){
        Vector list = new Vector<>();
        list.addElement("Ram");
        //addElement() adds an element at the last of a vector.
        list.addElement("Shyam");
        list.addElement("Seeta");
        System.out.println("Vector elements are: "+list);

        list.insertElementAt("Ravi", 2);
        System.out.println("Vector elements are: "+list);
    }
}
