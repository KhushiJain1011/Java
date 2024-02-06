//vector functions in java
// 1) addElement(value)
// 2) insertElementAt(item, index)
// 3) size()
// 4) removeElement(item)
// 5) removeElementAt(n)
// 6) removeAllElements()

import java.util.*;
public class Vector2 {
    public static void main(String[] args){
        Vector list = new Vector();
        list.addElement("Ram");
        list.addElement("Shyam");
        list.addElement("Seeta");
        System.out.println("Vector elements: "+list);
        list.insertElementAt("ravi", 1);
        System.out.println("Vector after inserting an element: "+list);
        System.out.println("Size of list is: "+list.size());
        list.removeElement("ravi");
        System.out.println("vector after removing an element: "+list);
        list.removeElementAt(1);
        System.out.println("List: "+list);
        list.removeAllElements();
        System.out.println(list);
    }
}
