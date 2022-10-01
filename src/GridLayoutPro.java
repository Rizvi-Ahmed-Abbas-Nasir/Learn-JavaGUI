import javax.swing.*;
import java.awt.*;

public class GridLayoutPro {

	public GridLayoutPro() {
		JFrame frame = new JFrame();
		GridBagLayout gb = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();
		frame.setVisible(true);
		frame.setSize(200,200);
		frame.setLayout(gb);
		
		
		
		Button b1 = new Button("Button 1");
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gb.setConstraints(b1, gbc);
		frame.add(b1);
		
		Button b2 = new Button("Button 2");
		
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gb.setConstraints(b2, gbc);
		frame.add(b2);
		
		Button b3 = new Button("Button 3");
		
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gb.setConstraints(b3, gbc);
		frame.add(b3);
		
		Button b4 = new Button("Button 4");
		
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gb.setConstraints(b4, gbc);
		frame.add(b4);
		
		Button b5 = new Button("Button 5");
		
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridwidth = 2;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gb.setConstraints(b5, gbc);
		frame.add(b5);
	}
	
	
	
	public static void main(String[] args) {
		GridLayoutPro Gd = new GridLayoutPro();
		
	}
	
}
