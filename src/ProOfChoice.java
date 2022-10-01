

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JLabel;

public class ProOfChoice {
	Frame frame = new Frame();
	
	public ProOfChoice() {
		frame.setVisible(true);
		frame.setSize(500,400);
		frame.setTitle("Rizvi Ahmed Abbas");
		frame.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		Choice choice = new Choice();
		choice.add("Summer");
		choice.add("Winter");
		choice.add("Rainly");
		choice.add("Autum");
		choice.getSelectedItem();
		choice.select(2);
		int num = choice.getItemCount();
		String str = choice.getSelectedItem();
		String num2 = choice.getItem(3);
		frame.add(choice);
		
		Label La = new Label();
		La.setText("Rizvi Ahmed Abbas");
		frame.add(La);
		
		Label La2 = new Label();
		La2.setText("The List Item Is "+String.valueOf(num));
		frame.add(La2);
		
		Label La3 = new Label();
		La3.setText("The List Item Is "+String.valueOf(num2));
		frame.add(La3);
		
		Label La4 = new Label();
		La4.setText("The List Item Is "+(str));
	
		frame.add(La4);
		
		
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent We) {
				System.exit(0);
			}
		});
		
	}
	public static void main(String[] args) {
		ProOfChoice ChoiceP = new ProOfChoice();	
	}

}
