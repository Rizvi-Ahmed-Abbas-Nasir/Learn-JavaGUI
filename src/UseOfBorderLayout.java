import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Iterator;

import javax.swing.JLabel;

public class UseOfBorderLayout {
	Frame frame = new Frame();
	
	public UseOfBorderLayout() {
		frame.setVisible(true);
		frame.setSize(200,200);
		frame.setTitle("Rizvi Ahmed Abbas");
		frame.setLayout(new BorderLayout());
		frame.add(new Button("NORTH"), BorderLayout.NORTH);
		frame.add(new Button("SOUTH"), BorderLayout.SOUTH);
		frame.add(new Button("WEST"), BorderLayout.WEST);
		frame.add(new Button("EAST"), BorderLayout.EAST);
		frame.add(new Button("CENTER"), BorderLayout.CENTER);
		
		
		
		
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent We) {
				System.exit(0);
			}
		});
		
	}
	public static void main(String[] args) {
		UseOfBorderLayout C = new UseOfBorderLayout();	
	}

}
