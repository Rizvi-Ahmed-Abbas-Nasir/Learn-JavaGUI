
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;


public class Switchjava implements KeyListener  {

	JFrame frame = new JFrame();
	public	String msg = "";
	public JLabel label = new JLabel("Press Any Key");
	public Switchjava() {
		frame.setVisible(true);
		frame.setSize(400,400);
		frame.setLayout(new FlowLayout());
		frame.addKeyListener(this);
		frame.add(label);

		
	}
		
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		
		switch (key) {
		case KeyEvent.VK_F1:
			msg = msg + "F1";
			break;
		case KeyEvent.VK_F2:
			msg = msg + "F2";
			break;
		case KeyEvent.VK_F3:
			msg = msg + "F3";
			break;
		case KeyEvent.VK_F4:
			msg = msg + "F4";
			break;
		case KeyEvent.VK_F5:
			msg = msg + "F5";
			break;
		case KeyEvent.VK_F6:
			msg = msg + "F6";
			break;
		case KeyEvent.VK_F7:
			msg = msg + "F7";
			break;
		case KeyEvent.VK_F8:
			msg = msg + "F8";
			break;
		case KeyEvent.VK_F9:
			msg = msg + "F9";
			break;
		case KeyEvent.VK_F10:
			msg = msg + "F10";
			break;
		case KeyEvent.VK_F11:
			msg = msg + "F11";
			break;
		case KeyEvent.VK_F12:
			msg = msg + "F12";
			break;
		case KeyEvent.VK_UP:
			msg = msg + "UP";
			break;
		case KeyEvent.VK_DOWN:
			msg = msg + "Down";
			break;
		case KeyEvent.VK_RIGHT:
			msg = msg + "Right";
			break;
		case KeyEvent.VK_LEFT:
			msg = msg + "Left";
			break;
		
		case KeyEvent.VK_A:
			msg = msg + "A";
			break;
		case KeyEvent.VK_B:
			msg = msg + "B";
			break;
		case KeyEvent.VK_S:
			msg = msg + "S";
			break;
		case KeyEvent.VK_R:
			msg = msg + "R";
			break;
		case KeyEvent.VK_SPACE:
			msg = msg + " ";
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + key);
		}
		
		
		
		label.setText(msg);
	}


	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	public static void main(String args[]) {
		Switchjava PR = new Switchjava();
	}

}
