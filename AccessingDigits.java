import java.util.Scanner;

public class AccessingDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner reader = new Scanner (System.in);

		    
			final double CBA;
			final int ABC;
			
			System.out.println("Enter dependants:"); 
			int dependants= reader.nextInt();
			
			System.out.println("Enter Gross Income:");
			
			double Gincome = reader.nextDouble();
			
			System.out.println("Gross income:" + Gincome);
			System.out.println("After taxes: " + (Gincome - DOLLARTEN - (DOLLARTWO * dependants)) * FLATRATE );
		
	}

}
