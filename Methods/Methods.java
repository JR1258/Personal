import java.util.Scanner;

public class Methods{
    static void m1(){

        Scanner reader = new Scanner(System.in);


        System.out.println("Enter whole name:");
        String namewhole = reader.nextLine(); 

        int space = namewhole.lastIndexOf(" ");

        String name = namewhole.substring(0, space);
        String surname = namewhole.substring(space + 1);
        



    }
    static void m2(){
        int currentyear = 2025;

    }


}