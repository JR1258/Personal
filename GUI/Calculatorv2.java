//plans for today.
//1. Make the calculator look nice DONE
//2. Make buttons for calculator where you dont type anymore but simply click the buttons and those get added to textfield DONE
//3. Make the calculator do the math DONE

//Overall project work
    //



import java.awt.*;

public class Calculatorv2 extends EasyApp {

    TextField Textboxx = addTextField("",25,100,150,50,this); 
    
    

    //these are the number buttons for the calculator
    Button one = addButton("1", 25, 150, 50, 30, this);
    Button two = addButton("2", 75, 150, 50, 30, this);
    Button three = addButton("3", 125, 150, 50, 30, this);    
    Button four = addButton("4", 25, 180, 50, 30, this);
    Button five = addButton("5", 75, 180, 50, 30, this);
    Button six = addButton("6", 125, 180, 50, 30, this);
    Button seven = addButton("7", 25, 210, 50, 30, this);
    Button eight = addButton("8", 75, 210, 50, 30, this);
    Button nine = addButton("9", 125, 210, 50, 30, this);
    Button zero = addButton("0", 75, 240, 50, 30, this);
   
    //Clears the textfield
    Button AC = addButton("AC", 25, 240, 50, 30, this);

    //Different math operations
    Button Multiply = addButton("(×)", 25, 300, 50, 30, this);
    Button Divide = addButton("(÷)", 75, 300, 50, 30, this);
    Button Addition = addButton("(+)", 125, 300, 50, 30, this);
    Button Subtraction = addButton("(-)", 25, 330, 50, 30, this);
    Button Root = addButton("(√)", 75, 330,50 , 30, this);
    Button Power = addButton("(^)", 125, 330, 50, 30, this);
    Button Log10 = addButton("log10", 100, 360, 75, 30, this);
    Button Log = addButton("log", 25, 360, 75, 30, this);
    Button Average = addButton("Average", 25, 390, 150, 30, this);

    //Quits programm
    Button quit = addButton("Quit", 25, 480, 150, 30, this);

    //is the equal sign button
    Button Calculate = addButton("=",125,240,50,30, this); //This button shows the final result of the calculator

    Label textscreeen  = addLabel("Calculator - Jonah",45,45,150,50,this); //Shows the title of the calculator

    public void actions(Object source,String command) {
        //If statements go in here

        if (source == one) {
            Textboxx.setText(Textboxx.getText() + "1");
        }
        if (source == two) {
            Textboxx.setText(Textboxx.getText() + "2");
        }
        if (source == three) {
            Textboxx.setText(Textboxx.getText() + "3");
        }
        if (source == four) {
            Textboxx.setText(Textboxx.getText() + "4");
        }
        if (source == five) {
            Textboxx.setText(Textboxx.getText() + "5");
        }
        if (source == six) {
            Textboxx.setText(Textboxx.getText() + "6");
        }
        if (source == seven) {
            Textboxx.setText(Textboxx.getText() + "7");
        }
        if (source == eight) {
            Textboxx.setText(Textboxx.getText() + "8");
        }
        if (source == nine) {
            Textboxx.setText(Textboxx.getText() + "9");
        }
        if (source == zero) {
            Textboxx.setText(Textboxx.getText() + "0");
        }
        if (source == AC) {
            Textboxx.setText("");
        }
        


        //This puts the sign into the textfield
        if (source == Multiply) {
            int i = Integer.parseInt(Textboxx.getText());
            Textboxx.setText(i + " × ") ;
        }
        
        //This puts the sign into the textfield
        if (source == Divide) {
            int i = Integer.parseInt(Textboxx.getText());

            Textboxx.setText(i + " ÷ ");
        }

        //This puts the sign into the textfield
        if (source == Addition) {
            int i = Integer.parseInt(Textboxx.getText());

            Textboxx.setText(i + " + ");
        }

        //This puts the sign into the textfield
        if (source == Subtraction) {
            int i = Integer.parseInt(Textboxx.getText());

            
            Textboxx.setText(i + " - ");
        }

        //This puts the sign into the textfield
        if (source == Root) {
            int i = Integer.parseInt(Textboxx.getText());

            Textboxx.setText(i +" √ ");
        }

        //This puts the sign into the textfield and gets the power from a prompt
        if (source == Power) {
            int i = Integer.parseInt(Textboxx.getText());
            String val = input("Enter Power:"); 
            int amount = Integer.parseInt(val);
            Textboxx.setText(i + " ^ " + amount);
        }
        if (source == Log10) {
            int i = Integer.parseInt(Textboxx.getText());
            Textboxx.setText(i + " log10 ");
        }
        if (source == Log) {
            int i = Integer.parseInt(Textboxx.getText());
            Textboxx.setText(i + " log ");
        }
        if (source == Average) {
            String val = input("Enter amount of numbers:"); 
            int amount = Integer.parseInt(val);
            int sum = 0;
            for (int i = 0; i < amount; i++) {
                String val2 = input("Enter number:"); 
                int num = Integer.parseInt(val2);
                sum += num;
            }
            int average = sum / amount;
            Textboxx.setText(average + "");
        }
                    
        //Quits the calculator
        if (source == quit) {
            System.exit(0);
        }
        

        //This calculates the result of the calculator using everything thats in the textbox
        if (source == Calculate){
         
            if (Textboxx.getText().contains("×")) {
                String[] parts = Textboxx.getText().split(" × ");
                int num1 = Integer.parseInt(parts[0]);
                int num2 = Integer.parseInt(parts[1]);
                int result = num1 * num2;
                Textboxx.setText(result + "");
            }
            if (Textboxx.getText().contains("÷")) {
                String[] parts = Textboxx.getText().split(" ÷ ");
                int num1 = Integer.parseInt(parts[0]);
                int num2 = Integer.parseInt(parts[1]);

                if (num2 == 0) {
                    Textboxx.setText("Error");
                    return;
                }

                int result = num1 / num2;
                Textboxx.setText(result + "");
            }
            if (Textboxx.getText().contains("+")) {
                String[] parts = Textboxx.getText().split(" \\+ ");
                int num1 = Integer.parseInt(parts[0]);
                int num2 = Integer.parseInt(parts[1]);
                int result = num1 + num2;
                Textboxx.setText(result + "");
            }
            if (Textboxx.getText().contains("-")) {
                String[] parts = Textboxx.getText().split(" - ");
                int num1 = Integer.parseInt(parts[0]);
                int num2 = Integer.parseInt(parts[1]);
                int result = num1 - num2;
                Textboxx.setText(result + "");
            }
            if (Textboxx.getText().contains("√")) {
                String[] parts = Textboxx.getText().split(" √ ");
                int num1 = Integer.parseInt(parts[0]);
                double result = Math.sqrt(num1);
                Textboxx.setText(result + "");
            }
            if (Textboxx.getText().contains("^")) {
                String[] parts = Textboxx.getText().split(" ^ ");
                int num1 = Integer.parseInt(parts[0]);
                int num2 = Integer.parseInt(parts[1]);
                double result = Math.pow(num1, num2);
                Textboxx.setText(result + "");
            }
            if (Textboxx.getText().contains("log10")) {
                String[] parts = Textboxx.getText().split(" log10 ");
                int num1 = Integer.parseInt(parts[0]);
                double result = Math.log10(num1);
                Textboxx.setText(result + "");
            }
            if (Textboxx.getText().contains("log")) {
                String[] parts = Textboxx.getText().split(" log ");
                int num1 = Integer.parseInt(parts[0]);
                double result = Math.log(num1);
                Textboxx.setText(result + "");
            }
        }
       
    }

    public static void main(String[] args) 
    {
        new Calculatorv2();
    }
}
