import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JLabel;

public class ListOfSelectedNewsPapet {
	Frame frame = new Frame();
	
	public ListOfSelectedNewsPapet() {
		frame.setVisible(true);
		frame.setSize(500,400);
		frame.setTitle("Rizvi Ahmed Abbas");
		frame.setLayout(new FlowLayout());
		
		List l = new List(5,true);
		l.add("Hindustan Times");
		l.add("The Indian Express");
		l.add("The Morung Express");
		l.add("The Navhind Times");

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
		ListOfSelectedNewsPapet C = new ListOfSelectedNewsPapet();	
	}

}
