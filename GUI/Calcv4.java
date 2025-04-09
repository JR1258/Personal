//NOTES FOR ANYONE TESTING THIS CODE:
//This is a calculator that can do basic math operations, square roots, powers, logarithms, averages, and trigonometry functions.
//Decimals only work for the SECOND number in the operation.
//The calculator can only do one operation at a time. (Ex. 2 + 2 * 2 will not work)

//Starting issues:
//If things such as the textfield or equals sign dont show up, try resizing the window or running the program again.
// And yes, I looked through the code why It happenes sometimes but I think it has something to do with the window size in the easyapp file

import java.awt.*;


public class Calcv4 extends EasyApp {

    //this is the textfield where the numbers and operations are displayed
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
   
    //this is the decimal button
    Button point = addButton(".",25 , 240, 50, 30, this);

    //clears the textfield
    Button AC = addButton("AC", 25, 270, 150, 30, this);

    //required Math operations
    Button Multiply = addButton("(×)", 25, 300, 50, 30, this);
    Button Divide = addButton("(÷)", 75, 300, 50, 30, this);
    Button Addition = addButton("(+)", 125, 300, 50, 30, this);
    Button Subtraction = addButton("(-)", 25, 330, 50, 30, this);
    Button Average = addButton("Average", 25, 390, 150, 30, this);

    
    //costom math operations
    Button Root = addButton("(√)", 75, 330,50 , 30, this);
    Button Power = addButton("(^)", 125, 330, 50, 30, this);
    Button Log10 = addButton("log10", 75, 360, 50, 30, this);
    Button Pi = addButton("π", 125, 360, 50, 30, this);
    Button Log = addButton("log", 25, 360, 50, 30, this);
    

    //Trigonometry functions
    Button sin = addButton("sin", 25, 420, 50, 30, this);
    Button cos = addButton("cos", 75, 420, 50, 30, this);
    Button tan = addButton("tan", 125, 420, 50, 30, this);

    //Quits programm
    Button quit = addButton("Quit", 25, 480, 150, 30, this);

    //is the equal sign button
    Button Calculate = addButton("=",125,240,50,30, this); //This button shows the final result of the calculator

    Label textscreeen  = addLabel("Calculator - Jonah",45,45,150,50,this); //Shows the title of the calculator

    //textscreeen.setFont(new Font("Serif", Font.BOLD, 20));
    
    @Override
    public void actions(Object source,String command) {
      try {
          
      
            // If statements go in here
            if (Textboxx.getText().indexOf(".0") == Textboxx.getText().length() - 2) {
                Textboxx.setText(Textboxx.getText().replace(".0", ""));
            }

            // This adds the numbers to the textfield
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

           
            // This adds the decimal to the textfield
            if (source == point) {
                Textboxx.setText(Textboxx.getText() + ".");
            }
           
           // This clears the textfield
            if (source == AC) {
                Textboxx.setText("");
            }

            // This puts the sign into the textfield
            if (source == Multiply) {            
                if(Textboxx.getText().equals("")){
                    Textboxx.setText("Enter a number first");
                    return;
                }
                
                int i = Integer.parseInt(Textboxx.getText());
                Textboxx.setText(i + " × ") ;
            }
            if (source == Divide) {
                if(Textboxx.getText().equals("")){
                    Textboxx.setText("Enter a number first");
                    return;
                }
                int i = Integer.parseInt(Textboxx.getText());
                Textboxx.setText(i + " ÷ ");
            }
            if (source == Addition) {
                if(Textboxx.getText().equals("")){
                    Textboxx.setText("Enter a number first");
                    return;
                }
                int i = Integer.parseInt(Textboxx.getText());

                Textboxx.setText(i + " + ");
            }
            if (source == Subtraction) {
                if(Textboxx.getText().equals("")){
                    Textboxx.setText("Enter a number first");
                    return;
                }
                int i = Integer.parseInt(Textboxx.getText());
                Textboxx.setText(i + " - ");
            }
            if (source == Root) {
                if(Textboxx.getText().equals("")){
                    Textboxx.setText("Enter a number first");
                    return;
                }
                int i = Integer.parseInt(Textboxx.getText());

                Textboxx.setText(i +" √ ");
            }
            if (source == Pi) {
                if(Textboxx.getText().equals("")){
                    double x = (double) Math.PI;
                    Textboxx.setText(x + "");
                    return;
                }  
                int i = Integer.parseInt(Textboxx.getText());

                Textboxx.setText(i +" π ");
            }
            if (source == Power) {

                if(Textboxx.getText().equals("")){
                    Textboxx.setText("Enter a number first");
                    return;
                }
                int i = Integer.parseInt(Textboxx.getText());
                Textboxx.setText(i + " ^ ");
            }
            if (source == Log10) {
                if(Textboxx.getText().equals("")){
                    Textboxx.setText("Enter a number first");
                    return;
                }
                int i = Integer.parseInt(Textboxx.getText());
                Textboxx.setText(i + " log10 ");
            }
            if (source == Log) {
                if(Textboxx.getText().equals("")){
                    Textboxx.setText("Enter a number first");
                    return;
                }
                int i = Integer.parseInt(Textboxx.getText());
                Textboxx.setText(i + " log ");
            }
            
            // This calculates the average of the numbers
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
            
            //Trig functions
            if (source == sin) {
                if (Textboxx.getText().equals("")) {
                    Textboxx.setText("Enter a number first");
                    return;
                }
                double i = Double.parseDouble(Textboxx.getText());
                Textboxx.setText(i + " sin ");   
            }
            if (source == cos) {
                if (Textboxx.getText().equals("")) {
                    Textboxx.setText("Enter a number first");
                    return;
                }   
                double i = Double.parseDouble(Textboxx.getText());
                Textboxx.setText(i + " cos ");
            }
            if (source == tan) {
                if (Textboxx.getText().equals("")) {
                    Textboxx.setText("Enter a number first");
                    return;
                }
                double i = Double.parseDouble(Textboxx.getText());
                Textboxx.setText(i + " tan ");
            }
            
            //makes sure there is something in the textfield before calculating
            if ( source == Calculate) {
                if (Textboxx.getText().equals("")) {
                    Textboxx.setText("Enter a number first");
                    return;
                }
            }

            // This quits the program
             if (source == quit) {
                System.exit(0);
            }
                        
            // This calculates the result of the calculator using everything that's in the textbox
            if(source == Calculate){

            
            String text = Textboxx.getText();
            String[] parts = text.split(" "); //splits the text into parts based on the spaces
            double num1 = Double.parseDouble(parts[0]); //turns the string from the first part into a number
            double num2 = Double.parseDouble(parts[2]); //turns the string from the third part into a number
            String sign = parts[1]; //takes the second part of the text and assigns it to the sign variable... This is the operation that will be done
                            double result = 0;

                            if(sign.equals("+")){
                                result =  num1 + num2;
                            }
                            if(sign.equals("-")){
                                result =  num1 - num2;
                            }
                            if(sign.equals("×")){
                                result =  num1 * num2;
                            }
                            if(sign.equals("÷")){
                                result =  num1 / num2;
                            }
                            if(sign.equals("√")){
                                result = Math.sqrt(num1);
                            }
                            if(sign.equals("^")){
                                result = Math.pow(num1, num2);
                            }

                              if(sign.equals (" π ")){
                                result = (double) Math.PI * num1;
                            }
                        

                            Textboxx.setText(result + "");
                            if(sign.equals("log10")){
                                result = (double) Math.log10(num1);
                            }
                            if(sign.equals("log")){
                                result = (double) Math.log(num1);
                            }
                            if(sign.equals("Average")){
                                result = (double) (num1 + num2) / 2;
                            }
                            if (sign.equals("sin")) {
                                result = Math.sin(Math.toRadians(num1));
                            }
                            if (sign.equals("cos")) {
                                result = Math.cos(Math.toRadians(num1));
                            }
                            if (sign.equals("tan")) {
                                result = Math.tan(Math.toRadians(num1));
                            }


            //This is there to remove the .0 from the end of the number if it's a whole number (Ex. 5.0 -> 5) If this wouldnt exist then for some reason the operations that follow wouldnt work
            if (String.valueOf(result).indexOf(".0") == String.valueOf(result).length() - 2) {
                Textboxx.setText(Textboxx.getText().replace(".0", ""));
            }
            Textboxx.setText(result + "");

                        }

                    } catch (Exception e) {
                        Textboxx.setText("Error, wrong input.");
                    }}
            
            public static void main(String[] args) 
    {
        new Calcv4();
    }
}
