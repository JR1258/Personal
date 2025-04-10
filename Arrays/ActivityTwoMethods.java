import java.util.Scanner;

public class ActivityTwoMethods {

	

	static void m1(int Year) {
	    int current = 2024;
		
	    
	    
		System.out.println("Your age is: " + (current - Year));

	}
	static String m2(String Name) {
	
	
		int loc = (Name.indexOf(' '));	
		
	
    return(Name.substring(loc+1) + ", " + Name.substring(0,loc));
	}
	
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.println("Enter bi
		rth year:");
		int Year = reader.nextInt();
		
		
		m1(Year);

		System.out.println("Enter Name:");
		String Name = reader.nextLine();
		 Name = reader.nextLine();
		System.out.println(m2(Name));
	}
	
}
