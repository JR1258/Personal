import java.util.Scanner;

public class ActivityTwoMethods {

	

	static void m1() {
	    int current = 2024;
		
		Scanner reader = new Scanner(System.in);
	    
	    System.out.println("Enter birth year:");
		int Year = reader.nextInt();
		
		System.out.println(current - Year);

	}
	static String m2() {
	
    Scanner reader = new Scanner(System.in);
	
		
	System.out.println("Enter Name:");
	String Name = reader.nextLine();
		
	int loc = (Name.indexOf(' '));
	
    return(Name.substring(loc+1) + ", " + Name.substring(0,loc));
	}
	
	public static void main(String[] args) {

		
		m1();
		System.out.println(m2());
	}
	
}
