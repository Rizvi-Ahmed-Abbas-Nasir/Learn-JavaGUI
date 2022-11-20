

import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;


public class PR10_1 implements KeyListener  {

	JFrame frame = new JFrame();
	public	JLabel label2 = new JLabel();
	public PR10_1() {
		frame.setVisible(true);
		frame.setSize(400,400);
		frame.setLayout(new FlowLayout());
		frame.addKeyListener(this); // key event in frame
		frame.add(label2);
	
		
	}
		
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	public void keyPressed(KeyEvent e) {
		label2.setText("Key Pressed");
		
	}


	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	public static void main(String args[]) {
		PR10_1 PR = new PR10_1();
	}

}
