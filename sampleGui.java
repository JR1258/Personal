import java.awt.Button; // Import the Button class from the AWT package for creating buttons.
import java.io.*; // Import input-output classes.
import java.awt.*; // Import the entire AWT package for GUI components.

// Define a public class named sampleGui that extends EasyApp class.
public class sampleGui extends EasyApp {

    // Declare GUI components: buttons, text fields, labels, checkbox, list, and choice.
    Button bEnter = addButton("Enter number",25,50,175,50, this); // Create a button with specified text and position.
    Button bChoices = addButton("Choices",225,50,175,50, this); // Create another button.
    Button bQuit = addButton("Quit",500,350,50,50, this); // Create a quit button.
    TextField tDisplay = addTextField("",150,100,200,50,this); // Create a text field with initial text and position.
    Label lDisplay  = addLabel("Current number",45,100,100,50,this); // Create a label with specified text and position.
    Checkbox cBox = addCheckbox("Check 1",45,150, 150, 50, this); // Create a checkbox with specified label and position.
    List lList = addList("name",45,200,150,50,this); // Create a list with specified label and position.
    Choice cChoice = addChoice("item",45,250,150,50,this); // Create a choice (dropdown) with specified label and position.

    // Constructor for initializing GUI components.
    public sampleGui() {
        // Add predefined items to the choice and list components.
        cChoice.add("item2"); // Add an item to the choice component.
        cChoice.add("item3"); // Add another item to the choice component.
        lList.add("name1"); // Add an item to the list component.
        lList.add("name2"); // Add another item to the list component.
    }

    // Method to handle actions performed on GUI components.
    public void actions(Object source,String command) {
        // Check if the source of the action is the "Enter number" button.
        if (source == bEnter) {
            // Prompt the user to input a number.
            String val = input("Enter amount"); 
            // Parse the input string to an integer.
            int amount = Integer.parseInt(val);
            // Double the entered number.
            int doubledAmount = doubleNum(amount);
            // Display the doubled number in the text field.
            tDisplay.setText("" + doubledAmount);
        }

        // Check if the checkbox is checked.
        if(cBox.getState()) { 
            // Display a message indicating the choice is noted.
            output("Choice noted");
        }

        // Check if the source of the action is the "Choices" button.
        if(source == bChoices) {
            // Display the selected index of the list and choice components.
            output("Selected index of list: " + lList.getSelectedIndex());
            output("Selected index of choice: " + cChoice.getSelectedIndex());
            // Display the selected items from list and choice components.
            tDisplay.setText(" " + lList.getItem(lList.getSelectedIndex()) + " " + cChoice.getSelectedIndex());  
        }

        // Check if the source of the action is the "Quit" button.
        if(source == bQuit) {  
            // Exit the application.
            System.exit(0);
        }    
    }

    // Method to double a given number.
    public int doubleNum(int am) {
        // Perform the doubling operation.
        am *= am;
        // Return the doubled value.
        return am;
    }
    
 // Entry point for the program.
    public static void main(String[] args) 
    {
        // Create an instance of the sampleGui class to initiate the GUI application.
        new sampleGui();
    }
}
