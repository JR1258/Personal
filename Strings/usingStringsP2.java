import java.util.Scanner;

public class usingStringsP2 {

	public static void main(String[] args) {
		try (Scanner reader = new Scanner(System.in)) {
            System.out.println("Enter Name:");
            String fullName = reader.nextLine();

            int spaceIndex = fullName.indexOf(" "); 
            String firstName = fullName.substring(0, spaceIndex); // Fix: Include the correct indices for extracting the first name
            String lastName = fullName.substring(spaceIndex + 1); // Fix: Include the correct indices for extracting the last name

            System.out.println(lastName + ", " + firstName); // Display last name, first name
        }
	}
}
