import java.util.Scanner;

public class usingStringsP1 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter First Name:");
        String Fname = reader.nextLine();
        int FnameLength = Fname.length();


        System.out.println("Enter Last Name:");
        String Lname = reader.nextLine();
        int LnameLength = Lname.length();

        int totalCharacters = FnameLength + LnameLength;

        double average = (double) totalCharacters / 2;

        System.out.println("Fname: " + Fname + ", Lname: " + Lname + ", Average Characters: " + average);
    }
}
