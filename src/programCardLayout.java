import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class programCardLayout extends JFrame implements ActionListener{
	
	 	
	CardLayout card;
	JButton b1,b2,b3;
	Container c;
	
	programCardLayout() {
		 c = getContentPane();
		 card = new CardLayout();
		 c.setLayout(card);
		 b1 = new JButton("Apple");
		 b2 = new JButton("Boy");
		 b3 = new JButton("Cat");
		 b1.addActionListener(this);
		 b2.addActionListener(this);
		 b3.addActionListener(this);
		 add(b1);
		 add(b2);
		 add(b3);
	}
	
	

	
	public void actionPerformed(ActionEvent e) {
	card.next(c);
		
		
	}
	 
	
	public static void main(String[] args) {
		programCardLayout  cardLayout = new programCardLayout();
		cardLayout.setSize(500,400);
		cardLayout.setVisible(true);
		cardLayout.setDefaultCloseOperation(EXIT_ON_CLOSE);	
	}

	
	
		
}
