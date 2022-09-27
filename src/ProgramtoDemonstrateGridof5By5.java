import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Iterator;

import javax.swing.JLabel;

public class ProgramtoDemonstrateGridof5By5 {
	Frame frame = new Frame();
	
	public ProgramtoDemonstrateGridof5By5() {
		frame.setVisible(true);
		frame.setSize(700,700);
		frame.setTitle("Rizvi Ahmed Abbas");
		frame.setLayout(new GridLayout(5,5,2,2));
		int b = 0;
		for(int i = 0; i < 5;i++ ) {
			for(int j = 0; j < 5;j++) {
				frame.add(new Button("Button "+b));
				b++;
			}
		}
		
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent We) {
				System.exit(0);
			}
		});
		
	}
	public static void main(String[] args) {
		ProgramtoDemonstrateGridof5By5 C = new ProgramtoDemonstrateGridof5By5();	
	}

}
