
import java.util.ArrayList;
//https://www.codestepbystep.com/r/problem/view/java/collections/arraylist/switchPairs?problemsetid=4327 


public static void switchPairs(ArrayList<String> list) {

    for (int i = 0; i < list.size() - 1; i += 2) {
                    String temp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, temp);

        }   
    }


// Test the switchPairs method
public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    list.add("A");
    list.add("B");
    list.add("C");
    list.add("D");
    list.add("E");

    System.out.println("Before switching: " + list);
    switchPairs(list);
    System.out.println("After switching: " + list);
}
// Output:
