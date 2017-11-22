package ch01.HelloJava;
import javax.swing.*; //used for JFrame Object

public class HelloJava 
{      
public static void main( String[] args ) 
	{ 
	//Prints Hello World to Command Line
	//System.out.println("Hello, Java!");
	 //************************************
	
	/** //This will print out a a box with title of Hello Java
	JFrame frame = new JFrame( "Hello, Java!" );    
	 frame.setSize( 300, 300 );    
	 frame.setVisible( true ); 
	 //************************************
	 **/
	
	 //Now to add context into the window
	 JFrame newFrame = new JFrame( "Hello, Java!" );        
	 JLabel newLabel = new JLabel("Hello, Java!", JLabel.CENTER );
	 newFrame.add(newLabel);        
	 newFrame.setSize( 300, 300 );        
	 newFrame.setVisible( true );
	 String phrase = "10 times 10";
	 JLabel number = new JLabel(phrase,JLabel.RIGHT);
	 newFrame.add(number);
	}    
} 