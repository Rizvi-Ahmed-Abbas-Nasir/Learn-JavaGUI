

import java.awt.*;
import java.awt.event.KeyEvent;

public class FindErrorMenu extends Frame {

	MenuBar mbBar = new MenuBar();
	Menu me1;
	MenuItem m1,m2,m3,m4;
	MenuShortcut mShortcut = new MenuShortcut(KeyEvent.VK_X);

	
	public FindErrorMenu() {
		
		setVisible(true);
		setTitle("Menu Program");
		setSize(500, 400);
		setMenuBar(mbBar);
		
		me1 = new  Menu("File");
		mbBar.add(me1);
		m1 = new MenuItem("New....");
		m2 = new MenuItem("Open...");
		m3 = new MenuItem("Save as");
		m4 = new MenuItem("Exit",mShortcut); // Added shortcut
		me1.add(m1);
		me1.add(m2);
		me1.add(m3);
		me1.addSeparator();
		me1.add(m4);
	}
	


	public static void main(String args[]) {
		FindErrorMenu FindErrorMenu1 = new FindErrorMenu();
	}
	
}


