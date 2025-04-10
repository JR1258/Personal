
import java.util.ArrayList;
import java.util.Scanner;

public class switchPairs {
//https://www.codestepbystep.com/r/problem/view/java/collections/arraylist/switchPairs?problemsetid=4327 


for (int i = 0; i < list.size() - 1; i += 2) {
    int temp = list.get(i);
    list.set(i, list.get(i + 1));
    list.set(i + 1, temp);
   



}
}    return list;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter numbers (0 to stop):");
        while (true) {
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            list.add(num);
        }
        System.out.println("Original list: " + list);
        ArrayList<Integer> switchedList = switchPairs(list);
        System.out.println("Switched pairs: " + switchedList);
    }




