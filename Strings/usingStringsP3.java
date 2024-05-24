import java.util.Scanner;

public class usingStringsP3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Enter Name:");
        String Name = reader.nextLine();

        int loc = (Name.indexOf(' '));
		
        System.out.println(Name.substring(loc+1) + ", " + Name.substring(0,loc));

	}

}
