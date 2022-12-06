

import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Pr12_3 implements ActionListener {

	JFrame frame = new JFrame("PR12_1 Abbas");
	JLabel label, label2, label3;
	JTextField textField =  new JTextField(18);
	JTextField textField2 =  new JTextField(18);
	JButton button = new JButton("Sum");
	public Pr12_3() {
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
		frame.setSize(500, 400);
		label = new JLabel("Number");
		label2 = new JLabel("Number");
		label3 = new JLabel();
		frame.add(label);
		frame.add(textField);
		frame.add(label2);
		frame.add(textField2);
		frame.add(button);
		frame.add(label3);
		button.addActionListener(this);
	}


	public static void main(String args[]) {
		Pr12_3 Pr12_3 = new Pr12_3();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
	String numString = textField.getText();
	String nuString = textField2.getText();
		
	int num1 = Integer.parseInt(nuString);
	int num2 = Integer.parseInt(numString);
	
	label3.setText("" + (num1+num2));

	}
		
}