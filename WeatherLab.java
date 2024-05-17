import java.util.Scanner;
import java.util.Arrays;

public class WeatherLab {
public static void main(String[] args) {
	
	Scanner reader = new Scanner(System.in);
	
	int daysover = 0;
	int count = 0;
	
	
	System.out.println("How many temps are you going to enter?");
	int numDays = reader.nextInt();
	
	int[] arr = new int[numDays];
	
	for(int i = 0; i < numDays; i++ )
	{
	System.out.println("Enter number");
    arr[i] = reader.nextInt(); 

    count = count + arr[i];
    
  System.out.println("Day " + (i+1) + "'s high temp: " + arr[i]);
  
  
    
	}
int average = (count / numDays);


System.out.println("Average temperature: " + average);
for(int x = 0; x < numDays; x++ ) {
	if(arr[x] > average) {
		daysover = daysover + 1;
	}
}
System.out.println(daysover + " days were above average.");


Arrays.sort(arr);



System.out.println("Two Hottest days: " + arr[(arr.length) - 2] + ", " + arr[(arr.length) -1]);
System.out.println("Two Coldest days: " + arr[0] + ", " + arr[1]);
	
	
}

}

