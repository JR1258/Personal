import java.util.Scanner;

public class usingStringsP2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

        System.out.println("Enter Name:");
        String fullName = reader.nextLine();

        int spaceIndex = fullName.indexOf(" "); 
        String firstName = fullName.substring(); 
        String lastName = fullName.substring(0, spaceIndex); 

        System.out.println(lastName + ", " + firstName); // Display last name, first name
	}
}
