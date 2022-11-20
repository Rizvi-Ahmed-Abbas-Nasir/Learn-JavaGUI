


import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.MouseMotionListener;

import javax.swing.*;
import java.awt.event.*;


public class PR11_4 implements MouseMotionListener {
	
	public JFrame frame = new JFrame("Rizvi Ahmed Abbas");
 public JLabel label = new JLabel("Draw");
	public PR11_4() {
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
		frame.setSize(500,400);
		frame.add(label);
		frame.addMouseMotionListener(this);
		
	}
	
	public void mouseDragged(MouseEvent e) {
		label.setText("Mouse is Dragged" +" At Postion " + e.getX() +", "+ e.getY()); // get the change position of x & y coordinate 
	
		Graphics g = frame.getGraphics();  // get the graphic 
	    g.setColor(Color.RED);   // set color blue
	    g.fillOval(e.getX(),e.getY(),15,15);  // fill color
		
	}


	public void mouseMoved(MouseEvent e) {
		label.setText("Mouse is Dragged"  +" At Postion " + e.getX() +", "+ e.getY()); // get the change position of x & y coordinate 
		
	  
	}
	
	public static void main(String[] args) {
		PR11_4 PR11_4 = new PR11_4();
	}



	




	


}
