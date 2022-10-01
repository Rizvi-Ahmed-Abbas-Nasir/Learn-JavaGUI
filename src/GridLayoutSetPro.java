
import javax.swing.*;
import java.awt.*;

public class GridLayoutSetPro {

	public GridLayoutSetPro() {
		JFrame frame = new JFrame();
		GridBagLayout gb = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();
		frame.setVisible(true);
		frame.setSize(500,400);
		frame.setLayout(gb);
		
		
		
		Label b1 = new Label("Name");
		b1.setSize(20,5);
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gb.setConstraints(b1, gbc);
		frame.add(b1);
		
		TextField b2 = new TextField("Rizvi Ahmed Abbas");
		
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gb.setConstraints(b2, gbc);
		frame.add(b2);
		
		Label b3 = new Label("Comments");
		
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gb.setConstraints(b3, gbc);
		frame.add(b3);
		
		TextArea b4 = new TextArea("Im Computer Engineer");
		
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gb.setConstraints(b4, gbc);
		frame.add(b4);
		
		Button b5 = new Button("Submit");
		
		gbc.gridx = 1;
		gbc.gridy = 2;
	
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gb.setConstraints(b5, gbc);
		frame.add(b5);
	}
	
	
	
	public static void main(String[] args) {
		GridLayoutSetPro Gd = new GridLayoutSetPro();
		
	}
	
}

