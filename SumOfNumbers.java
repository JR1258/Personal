import java.util.Scanner;
public class SumOfNumbers {
		static String finer(int num) {
			int count = 0;
			for(int i = 0; i < num; i++) {
			if(i % 2 == 0) {
			count = count + i; }}	
			return "Your Original Number: " + num + ", and the sum of the numbers leading up to that: " + count;}
		public static void main(String[] args){
			Scanner reader = new Scanner(System.in);
			System.out.println("Enter num: ");
			int Num1 = reader.nextInt();
		System.out.println(finer(Num1));}}