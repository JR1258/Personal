import java.util.Scanner;

public class Averageoftwonumbers {

	

	
	static double m2(double Num1, double Num2) {
	
    
	
	double average = (Num1 + Num2) / 2; 
	
	return average;
	}
	
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		
		System.out.println("Enter num1:");
		int Num1 = reader.nextInt();
			
		System.out.println("Enter num2: ");
		double Num2 = reader.nextInt();
	
		System.out.println(m2(Num1, Num2));
	}
	
}
