import javax.swing.*;

import java.awt.FlowLayout;
import java.awt.event.*;


public class Labelprogram  implements ItemListener{
	
	JFrame frame = new JFrame("Abbas Applet");
	JLabel label = new JLabel();
	JComboBox comboBox = new JComboBox();
	public Labelprogram() {
		frame.setSize(400, 400);
		frame.setVisible(true);
		frame.setLayout(new FlowLayout());
		frame.getDefaultCloseOperation();
		
		
		frame.add(comboBox);
		comboBox.addItem("Solapur");
		comboBox.addItem("Pune");
		comboBox.addItem("Banglore");
		comboBox.addItem("Mumbai");
		comboBox.addItem("Delhi");
		comboBox.setEditable(true);
		boolean b = comboBox.isEditable();
		comboBox.addItemListener(this);
		frame.add(label);
	
	}
	
	public void itemStateChanged(ItemEvent e) {
		String stateNameString = comboBox.getSelectedItem().toString();
		label.setText("Your are in "+stateNameString);
		
		
	}

	
	public static void main(String args[]) {
		Labelprogram labelprogram1 = new Labelprogram(); 
	}




	
}
