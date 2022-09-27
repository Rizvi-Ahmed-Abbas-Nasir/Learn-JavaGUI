import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JLabel;

public class ListProgram {
	Frame frame = new Frame();
	
	public ListProgram() {
		frame.setVisible(true);
		frame.setSize(500,400);
		frame.setTitle("Rizvi Ahmed Abbas");
		frame.setLayout(new FlowLayout());
		
		List l = new List(4,true);
		l.add("Summer");
		l.add("Winter");
		l.add("Rainly");
		l.add("Autum");
		l.getSelectedItem();
		l.select(3);
		int num = l.getItemCount();
		frame.add(l);
		
		Label La = new Label();
		La.setText("Rizvi Ahmed Abbas");
		frame.add(La);
		
		Label La2 = new Label();
		La2.setText("The List Item Is "+String.valueOf(num));
		frame.add(La2);
		
		
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent We) {
				System.exit(0);
			}
		});
		
	}
	public static void main(String[] args) {
	 ListProgram List = new ListProgram();	
	}

}
