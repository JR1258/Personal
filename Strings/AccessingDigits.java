import java.util.Scanner;

public class AccessingDigits {

	private static final double DOLLARTEN = 0;
	private static final int DOLLARTWO = 0;
	private static final double FLATRATE = 0;

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter dependants:");
		int dependants = reader.nextInt();
		
		System.out.println("Enter Gross Income:");
		double Gincome = reader.nextDouble();
		
		System.out.println("Gross income:" + Gincome);
		System.out.println("After taxes: " + (Gincome - DOLLARTEN - (DOLLARTWO * dependants)) * FLATRATE);
		
		reader.close();
	}

}
