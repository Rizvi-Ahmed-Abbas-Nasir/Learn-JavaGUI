
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;

public class PR12_2 implements ActionListener {

	JFrame frame = new JFrame("PR12_1 Abbas");
	JLabel label, label2, label3;
	JTextField textField =  new JTextField(18);
	JPasswordField passwordField = new JPasswordField(15);
	JButton button = new JButton("Login");
	public PR12_2() {
		GridBagLayout gb = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();
		frame.setLayout(gb);
		frame.setVisible(true);
		frame.setSize(500, 400);
		label3 = new JLabel("");
		label2 = new JLabel("Password");
		label2 = new JLabel("Password");
		label = new JLabel("Username");
		label2 = new JLabel("Password");
		label.setSize(20,5);
		gbc.ipadx = 20;
		gbc.gridx = 0;
		gbc.gridy = 35;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gb.setConstraints(label, gbc);
		
		textField.setSize(20,5);
		gbc.gridx = 1;
		gbc.gridy = 35;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gb.setConstraints(textField, gbc);
		
		label2.setSize(20,5);
		gbc.gridx = 0;
		gbc.gridy = 40;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gb.setConstraints(label2, gbc);
		
		passwordField.setSize(20,5);
		gbc.gridx = 1;
		gbc.gridy = 40;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gb.setConstraints(passwordField, gbc);
		
		button.setSize(20,5);
		gbc.gridx = 1;
		gbc.gridy = 50;
		gbc.weightx = 0;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gb.setConstraints(button, gbc);
		
		label3.setSize(20,5);
		gbc.gridx = 1;
		gbc.gridy = 60;
		gbc.weightx = 0;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gb.setConstraints(label3, gbc);
	
		passwordField.setEchoChar('#');
		

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