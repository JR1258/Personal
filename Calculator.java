//plans for today.
//1. Make the calculator look nice
//2. Make buttons for calculator where you dont type anymore but simply click the buttons and those get added to textfield




import java.awt.*; 

public class Calculator extends EasyApp {

    Label Num1text  = addLabel("Enter First here:",25,150,130,50,this); //Shows what to do infront of textbox
    Label Num2text  = addLabel("Enter second here:",25,100,130,50,this); //Shows what to do infront of textbox


    TextField Num1 = addTextField("",175,100,100,50,this); //Button for first number
    TextField Num2 = addTextField("",175,150,100,50,this); //Button for second number
   
    Checkbox Multiply = addCheckbox("Multiplication (x)",45,150, 150, 30, this); //multiplication checkbox
    Checkbox Divide = addCheckbox("Division (/)",45,180, 150, 30, this); //division checkbox
    Checkbox Addition = addCheckbox("Addition (+)",45,210, 150, 30, this); //addition checkbox
    Checkbox Subtraction = addCheckbox("Subtraction (-)",45,240, 150, 30, this); //subtraction checkbox

    Button Calculate = addButton("Calculate",25,300,100,50, this); //This button shows the final result of the calculator

    Label textscreeen  = addLabel("Calculator - Jonah",45,45,150,50,this); //Shows the title of the calculator

    Button fontchange = addButton("Change Font", 25, 350, 100, 50, this); //changes the font for everything

    public Calculator() {
        // Add predefined items to the choice and list components.
        //Stuff in lists / drop down menus go in here     
    }

    public void actions(Object source,String command) {
        //If statements go in here

       /* if (source == Num1) {
            // Prompt the user to input a number.
            String val = input("Enter amount"); 
            double num1 = Integer.parseInt(val);
        }
        if (source == Num2) {
            // Prompt the user to input a number.
            String val2 = input("Enter amount"); 
            double num2 = Integer.parseInt(val2);
        }
*/
       
        //this is the code that changes the font
        if (source == fontchange){
            Font f = new Font("Serif",NORMAL,15);
            fontchange.setFont(f);
            Num1.setFont(f);
            Num2.setFont(f);
            Multiply.setFont(f);
            Divide.setFont(f);
            Addition.setFont(f);
            Subtraction.setFont(f);
            Calculate.setFont(f);
            textscreeen.setFont(f);
        }

        //this is the code that calculates the result
        if (source == Calculate) {
            double num1 = Double.parseDouble(Num1.getText()); //gets num1 and num2 values from textfields
            double num2 = Double.parseDouble(Num2.getText());

            double result = 0; //initializes the result

            if (Multiply.getState()) { //checks which checkbox is selected and if selected follows whats inside it
                result = num1 * num2;
            }
            if (Divide.getState()) {
                result = num1 / num2;
            }
            if (Addition.getState()) {
                result = num1 + num2;
            }
            if (Subtraction.getState()) {
                result = num1 - num2;
            }
            output("Result: " + result); //outputs the result
        }
        //the following if things make sure that only one checkbox is selected at a time
        if(source == Multiply){
            Divide.setState(false);
            Addition.setState(false);
            Subtraction.setState(false);
        }
        if(source == Divide){
            Multiply.setState(false);
            Addition.setState(false);
            Subtraction.setState(false);
        }
        if(source == Addition){
            Multiply.setState(false);
            Divide.setState(false);
            Subtraction.setState(false);
        }
        if(source == Subtraction){
            Multiply.setState(false);
            Divide.setState(false);
            Addition.setState(false);
        }
    }

    public static void main(String[] args) 
    {
        new Calculator(); //shows the screen
    }
}
