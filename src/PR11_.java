import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

import javax.swing.*;
import javax.swing.event.MouseInputAdapter;

import org.w3c.dom.events.MouseEvent;


public class PR11_ implements MouseListener {
	
	JFrame frame = new JFrame("Rizvi Ahmed Abbas");
 public JLabel label = new JLabel("Hello Mouse");
	public PR11_() {
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
		frame.setSize(500,400);
		frame.add(label);
		label.addMouseListener(this);
		
	}
	
	
	
	public static void main(String[] args) {
		PR11_ pr11_ = new PR11_();
	}



	@Override
	public void mouseClicked(java.awt.event.MouseEvent e) {
		label.setText("Mouse No of Clicks "+ e.getClickCount() +  ", "+ e.getLocationOnScreen()); // get the x and y location of screen
		
		
	}
	@Override
	public void mousePressed(java.awt.event.MouseEvent e) {
		label.setText("Mouse Pressed no. of clicks: " + e.getClickCount() + " At Postion " + e.getX() +", "+ e.getY() +  ", "+ e.getLocationOnScreen());
		
	}

	@Override
	public void mouseReleased(java.awt.event.MouseEvent e) {
		label.setText("Mouse Released; # of clicks:  "+e.getClickCount() +  ", "+ e.getLocationOnScreen()); // get the x and y location of screen
		
	}


	@Override
	public void mouseExited(java.awt.event.MouseEvent e) {
	label.setText("Mouse Exited" +  ", "+ e.getLocationOnScreen());	// get the x and y location of screen
	}



	@Override
	public void mouseEntered(java.awt.event.MouseEvent e) {
		label.setText("Mouse Enter" +  ", "+ e.getLocationOnScreen()); // get the x and y location of screen
		
	}


}
