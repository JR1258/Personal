import java.util.Scanner;
public class incometax {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner reader = new Scanner (System.in)) {
			final double FLATRATE = 0.20;
			final int DOLLARTEN = 10000;
			final int DOLLARTWO = 2000;
			
			System.out.println("Enter dependants:"); 
			int dependants= reader.nextInt();
			
			System.out.println("Enter Gross Income:");
			double Gincome = reader.nextDouble();
			
			System.out.println("Gross income:" + Gincome);
			System.out.println("After taxes: " + (Gincome - DOLLARTEN - (DOLLARTWO * dependants)) * FLATRATE );
		}
	

		

	}

}

