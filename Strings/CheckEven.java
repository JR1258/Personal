import java.util.Scanner;

public class CheckEven {
		static String finer(int num) {
		String oddoreven = "odd";
			if(num % 2 == 0) {
				oddoreven = "even";
			}
return oddoreven;
		}
		
		
		public static void main(String[] args) {
			
			Scanner reader = new Scanner(System.in);
				
				
			System.out.println("Enter num: ");
			int Num1 = reader.nextInt();
		
				
		System.out.println(finer(Num1));
		}
		
	}



