import java.awt.*;
public class DisabledMenu {

	Frame frame = new  Frame();
	Menu m1,m2,m3,m4;
	MenuBar mBar = new MenuBar();
	public DisabledMenu() {
		frame.setVisible(true);
		frame.setTitle("Program");
		frame.setSize(500,400);
		frame.setMenuBar(mBar);
		
		m1 = new Menu("Green");
		m2 =new Menu("Red");
		m3 = new Menu("Blue");
		m4 = new Menu("Black");
		
		
		mBar.add(m1);
		mBar.add(m2);
		mBar.add(m3);
		mBar.add(m4);
		
		m4.setEnabled(false);
			
		
		
	}
	
	
	
	
	
	
	public static  void main(String args[]) {
		DisabledMenu disabledMenu = new DisabledMenu();
	}
}
