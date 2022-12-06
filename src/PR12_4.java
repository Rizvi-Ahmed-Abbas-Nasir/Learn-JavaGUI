
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PR12_4 implements ActionListener {

	JFrame frame = new JFrame("PR12_1 Abbas");
	JLabel label, label2, label3,label4;
	JTextField textField =  new JTextField(18);
	JPasswordField passwordField = new JPasswordField(15);
	JButton button = new JButton("Login");
	public PR12_4() {
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
		frame.setSize(500, 400);
		passwordField.setEchoChar('#');
		label = new JLabel("Username");
		label2 = new JLabel("Password");
		label3 = new JLabel();
		label4 = new JLabel();
		frame.add(label);
		frame.add(textField);
		frame.add(label2);
		frame.add(passwordField);
		frame.add(button);
		frame.add(label3);
		frame.add(label4);
		button.addActionListener(this);
	}


	public static void main(String args[]) {
		PR12_4 PR12_4 = new PR12_4();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
	String username = textField.getText();
	String password = String.valueOf(passwordField.getPassword());
	
	if(username.equals("abbas") && password.equals("abbas")) {
		int len  =  password.length();
		if (len > 6) {
			label3.setText("Login Successfully");
		}
		else {
			label4.setText("Password Should be Greater than 6 ");
		}
	}
	else {
		label3.setText("Login Faild");
	}
	}
		
}