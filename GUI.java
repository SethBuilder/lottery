import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class GUI extends JFrame implements ActionListener{
	
	private JButton gbutton;
	private JTextField lot_num;
	
	
	public GUI(){
		
		
	//window properties
	setSize(400, 120);
	setLocation(100, 200);
	setTitle("Lottery Draw!");
	
	//creating text field to hold lottery number
	lot_num = new JTextField(8);
	lot_num.setEditable(false);
	
	//creating a button to generate number and action listener
	gbutton = new JButton("Generate Number");
	gbutton.addActionListener(this);
	
	//creating two panels, one for text field and one for button
	JPanel p1= new JPanel();
	JPanel p2 = new JPanel();
	
	//adding elements to panels
	p1.add(lot_num);
	p2.add(gbutton);
	
	//adding panels to JFrame
	add(p1, "North");
	add(p2, "South");
	
	//making window visible 
	setVisible(true);
				}//end of constructor
	
	
	//action listener method to respond to button
	public void actionPerformed(ActionEvent e) {
			Number numb = new Number();//generates Number object
			lot_num.setText(Arrays.toString(numb.generate()));//converts array to string
		
	}
}
