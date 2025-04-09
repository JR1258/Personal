import java.util.ArrayList;
import java.util.Scanner;

public class DigitsClass {

private ArrayList<Integer> list;


    public DigitsClass(int number) {
        this.number = number;
    }


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number: ");
        number = reader.nextInt();
        System.out.println("You entered: " + number);
        reader.close();

    }
}
