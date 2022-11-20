
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseMotionListener;

import javax.swing.*;
import java.awt.event.*;


public class PR11_2Changebg implements MouseMotionListener {
	
	public JFrame frame = new JFrame("Rizvi Ahmed Abbas");
 public JLabel label = new JLabel("Hello Mouse");
	public PR11_2Changebg() {
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
		frame.setSize(500,400);
		frame.add(label);
		frame.addMouseMotionListener(this);
		
	}
	
	public void mouseDragged(MouseEvent e) {
		frame.getContentPane().setBackground(Color.RED);
		label.setText("RED");
		
	}


	public void mouseMoved(MouseEvent e) {
		frame.getContentPane().setBackground(Color.BLUE);
		label.setText("BLUE");
	}
	
	public static void main(String[] args) {
		PR11_2Changebg PR11_2Changebg = new PR11_2Changebg();
	}



	




	


}
