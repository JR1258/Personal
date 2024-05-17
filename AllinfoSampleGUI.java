import java.io.*; 
import java.awt.*; 

public class AllinfoSampleGUI extends EasyApp {
	
  String[] arr = new String[4];

	
    Button But1 = addButton("Hello",25,50,175,50, this); 

    Button Quit = addButton("Quit", 25, 325, 50,50, this);
    
    
    TextField TextBox = addTextField("",25,100,175,50,this); // Create a text field with initial text and position.

    Button getmatext = addButton("Save...", 215, 100,50, 50, this);

    Button fontchange = addButton("Font Change", 75, 325, 100, 50, this);
    
  
    
    
    Checkbox checkbox = addCheckbox("German",50,150, 80, 30, this); // Create a checkbox with specified label and position.

    Checkbox checkbox2 = addCheckbox("English",130,150, 80, 30, this); // Create a checkbox with specified label and position.

    Checkbox checkbox3 = addCheckbox("Spanish",50,170, 80, 50, this); // Create a checkbox with specified label and position.

    Checkbox checkbox4 = addCheckbox("French",130,170, 80, 50, this); // Create a checkbox with specified label and position.

    
    Choice choice = addChoice("Select your Favorite Language frome the languages that you speak below:",45,250,150,50,this); // Create a choice (dropdown) with specified label and position.

    
    

    
    public AllinfoSampleGUI() {
        // Add predefined items to the choice and list components.


    }
  
    
    
    public void actions(Object source,String command) {
        if (source == But1) {
            TextBox.setText("Hello");	
        }
        if (source == Quit) {
            System.exit(0);
        }
        if (source == getmatext) {
        	String textboxthing = TextBox.getText();
        	output(textboxthing);
        }
        if (source == fontchange) {
        	
        	Font f = new Font("Serif",NORMAL,15);
        	fontchange.setFont(f);
        }
        if (checkbox.getState() == true) { 
            choice.add("German"); // Add another item to the choice component.
        }
        if (checkbox2.getState() == true) { 
            choice.add("English"); // Add another item to the choice component.
        }
        if (checkbox3.getState() == true) { 
            choice.add("Spanish"); // Add another item to the choice component.
        }
        if (checkbox4.getState() == true) { 
            choice.add("French"); // Add another item to the choice component.
            checkbox4.setState(false);
        }
        if (source == choice) {
        	output("Selected index of list: " + choice.getSelectedIndex());
        	
        }

    }
public static void main(String[] args) 
    {
        new AllinfoSampleGUI();
    }
}