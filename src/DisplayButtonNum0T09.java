import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Iterator;

import javax.swing.JLabel;

public class DisplayButtonNum0T09 {
	Frame frame = new Frame();
	
	public DisplayButtonNum0T09() {
		frame.setVisible(true);
		frame.setSize(300,300);
		frame.setTitle("Rizvi Ahmed Abbas");
		frame.setLayout(new GridLayout(5,5));
		int b = 0;
		for(int i = 0; i <= 9;i++ ) {
				frame.add(new Button("Button "+b));
				b++;
		}
		
		
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent We) {
				System.exit(0);
			}
		});
		
	}
	public static void main(String[] args) {
		DisplayButtonNum0T09 C = new DisplayButtonNum0T09();	
	}

}
