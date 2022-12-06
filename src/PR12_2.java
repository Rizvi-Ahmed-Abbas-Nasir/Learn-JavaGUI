
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PR12_2 implements ActionListener {

	JFrame frame = new JFrame("PR12_1 Abbas");
	JLabel label, label2, label3;
	JTextField textField =  new JTextField(18);
	JPasswordField passwordField = new JPasswordField(15);
	JButton button = new JButton("Login");
	public PR12_2() {
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
		frame.setSize(500, 400);
		passwordField.setEchoChar('#');
		label = new JLabel("Username");
		label2 = new JLabel("Password");
		label3 = new JLabel();
		frame.add(label);
		frame.add(textField);
		frame.add(label2);
		frame.add(passwordField);
		frame.add(button);
		frame.add(label3);
		button.addActionListener(this);
	}


	public static void main(String args[]) {
		PR12_2 PR12_2 = new PR12_2();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
	String username = textField.getText();
	String password = String.valueOf(passwordField.getPassword());
	
	if(username.equals("Abbas") && password.equals("Abbas112")) {
		label3.setText("Login Successfully");
	}
	else {
		label3.setText("Login Faild");
	}
	}
		
}