import java.awt.Frame;
import java.awt.event.*;

import javax.lang.model.element.NestingKind;

public class keypro implements KeyListener{

	Frame f = new Frame();
	
	public keypro() {
		f.setSize(400,400);
		f.setVisible(true);
		
		f.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				
				System.out.println("Print");
			}
		});
	}
	
	public static void main(String args[]) {
		keypro keypro = new keypro();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
 
	
}
