/*
 * Write a program that assigns a number of minutes to an integer variable and then converts that number to the equivalent hours and minutes.

 */
public class minuteshours {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalMinutes = 2000;
		int hours = totalMinutes / 60;
        int minutes = totalMinutes % 60;
        int days = totalMinutes / (60 * 24);
        System.out.println("Days: " + days + " Hours: " + hours + " Remainder Minutes: " + minutes);
	}

}
