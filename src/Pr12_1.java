
import java.awt.FlowLayout;
import java.awt.TextField;

import javax.swing.*;

public class Pr12_1 {

	JFrame frame = new JFrame("PR12_1 Abbas");
	JLabel label, label2;
	JTextField textField =  new JTextField(18);
	JPasswordField passwordField = new JPasswordField(15);
	JButton button = new JButton("Login");
	public Pr12_1() {
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
		frame.setSize(500, 400);
		passwordField.setEchoChar('#');
		label = new JLabel("Username");
		label2 = new JLabel("Password");
		frame.add(label);
		frame.add(textField);
		frame.add(label2);
		frame.add(passwordField);
		frame.add(button);
		
	}


	public static void main(String args[]) {
		Pr12_1 pr12_1 = new Pr12_1();
	}
		
}
