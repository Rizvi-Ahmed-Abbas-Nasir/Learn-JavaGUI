import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.jar.Attributes.Name;

import javax.swing.*;

public class Pr12_1 implements ActionListener {

	JFrame frame = new JFrame("PR12_1 Abbas");
	JLabel label, label2, namelabel,enroll;
	JTextField textField =  new JTextField(18);
	JPasswordField passwordField = new JPasswordField(15);
	JButton button = new JButton("Login");
	public Pr12_1() {
		GridBagLayout gb = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();
		frame.setLayout(gb);
		frame.setVisible(true);
		frame.setSize(500, 400);
		namelabel = new JLabel();
		enroll = new JLabel();
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
		
		namelabel.setSize(40,10);
		gbc.gridx = 1;
		gbc.gridy = 60;
		gbc.weightx = 0;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gb.setConstraints(namelabel, gbc); 
		
		enroll.setSize(50,10);
		gbc.gridx = 1;
		gbc.gridy = 70;
		gbc.weightx = 0;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gb.setConstraints(enroll, gbc);
		passwordField.setEchoChar('#');
	
		frame.add(label);
		frame.add(textField);
		frame.add(label2);
		frame.add(passwordField);
		frame.add(button);
		frame.add(enroll);
		frame.add(namelabel);
		
		button.addActionListener(this);
		
	}


	public static void main(String args[]) {
		Pr12_1 pr12_1 = new Pr12_1();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		namelabel.setText("Username "+textField.getText());
		enroll.setText("Password "+String.valueOf(passwordField.getPassword()));
		
		
	}
		
}
