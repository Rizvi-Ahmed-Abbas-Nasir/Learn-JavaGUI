

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

import javax.swing.*;
import javax.swing.event.MouseInputAdapter;

import org.w3c.dom.events.MouseEvent;


public class PR11_3java extends JFrame implements MouseListener {
	
	JFrame frame = new JFrame("Rizvi Ahmed Abbas");
 public JLabel label = new JLabel("Hello Mouse");
	public PR11_3java() {
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(500,400);
		add(label);
		label.addMouseListener(this);
		
	}
	
	
	
	public static void main(String[] args) {
		PR11_3java PR11_3java = new PR11_3java();
	}



	@Override
	public void mouseClicked(java.awt.event.MouseEvent e) {
		label.setText("Mouse No of Clicks "+ e.getClickCount());
		
	}
	@Override
	public void mousePressed(java.awt.event.MouseEvent e) {
		label.setText("Mouse Pressed no. of clicks: " + e.getClickCount() + " At Postion " + e.getX() +", "+ e.getY());
		
	}

	@Override
	public void mouseReleased(java.awt.event.MouseEvent e) {
		label.setText("Mouse Released; # of clicks:  "+e.getClickCount());
		
	}


	@Override
	public void mouseExited(java.awt.event.MouseEvent e) {
	label.setText("Mouse Exited"+ " At Location "+ getLocationOnScreen() );	// get the x and y location of screen
	}



	@Override
	public void mouseEntered(java.awt.event.MouseEvent e) {
		label.setText("Mouse Enter" + " At Location "+ getLocationOnScreen()); // get the x and y location of screen 
		
	}


}
