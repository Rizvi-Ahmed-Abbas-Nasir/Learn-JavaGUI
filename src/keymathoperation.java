

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;


public class keymathoperation implements ActionListener  {

	JFrame frame = new JFrame();
	public	String msg = "";
	public JLabel label = new JLabel();
 public	JButton button = new JButton("SUM");
 public TextField textField, textField2;

	
	public keymathoperation() {
		frame.setVisible(true);
		frame.setSize(500,500);
		frame.setLayout(new FlowLayout());
		
		
		textField = new TextField();
		textField2  = new TextField();
		textField.setBounds(50, 150, 200, 30);
		textField2.setBounds(50, 150, 200, 30);
		button.addActionListener(this);
		
		frame.add(textField);
		frame.add(textField2);
		frame.add(button);
		frame.add(label);
	}
	
	
public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == button) {
	
			int t1 = Integer.parseInt(textField.getText());
			int t2 = Integer.parseInt(textField2.getText());		
			label.setText(""  + (t1 *  t2));
		}
	
}
	
	public static void main(String args[]) {
		keymathoperation PR = new keymathoperation();
	}


	
	
		
	
}
