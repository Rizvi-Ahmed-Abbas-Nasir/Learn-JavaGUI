import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JLabel;

public class CiitiesNameLIst {
	Frame frame = new Frame();
	
	public CiitiesNameLIst() {
		frame.setVisible(true);
		frame.setSize(500,400);
		frame.setTitle("Rizvi Ahmed Abbas");
		frame.setLayout(new FlowLayout());
		
		List l = new List(10,true);
		l.add("Mumbai");
		l.add("Delhi");
		l.add("Kaliayan");
		l.add("Nerul");
		l.add("Nerul");
		l.add("Mumbra");
		l.add("Lackynow");
		l.add("Kolkata");
		l.add("Banglore");
		l.add("Harderbad");
		String SelectItem = l.getItem(3);
		l.select(3);
		int num = l.getItemCount();
		frame.add(l);
		
		Label La = new Label();
		La.setText("Rizvi Ahmed Abbas");
		frame.add(La);
		
		Label La2 = new Label();
		La2.setText("The List Item Is "+String.valueOf(num));
		frame.add(La2);
		
		Label La3 = new Label();
		La3.setText("The Name of Selected Item "+ (SelectItem));
		frame.add(La3);
		
		
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent We) {
				System.exit(0);
			}
		});
		
	}
	public static void main(String[] args) {
		CiitiesNameLIst C = new CiitiesNameLIst();	
	}

}
