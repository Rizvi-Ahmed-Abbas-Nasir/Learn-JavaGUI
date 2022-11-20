import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridLayout;
import java.util.Iterator;

import javax.swing.*;


public class ScrollPaneProgram {

	
	JFrame frame = new JFrame("Scroll Pane Program");
	JPanel panel = new JPanel();
	public ScrollPaneProgram() {
		panel.setLayout(new GridLayout(20,20));
		int b = 0;
		for(int i = 0; i < 20;i++) {
			for(int j = 0; j < 20; j++) {
				panel.add(new JButton("Button" +b));
				b++;
			}
		}
		
		int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
		int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
		
		JScrollPane scrollPane = new JScrollPane(panel, v, h);
		
		frame.add(scrollPane, BorderLayout.CENTER);
		frame.setVisible(true);
		frame.setSize(400,400);
		
	}
	
	
	
	
	public static void main(String args[]) {
		ScrollPaneProgram ScrollPaneProgram = new ScrollPaneProgram();
	}
}
