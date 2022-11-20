import javax.swing.*;

import java.awt.CheckboxMenuItem;
import java.awt.FlowLayout;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.MenuShortcut;
import java.awt.event.*;

public class SubmenuProgram {

	JFrame frame = new JFrame();
	MenuBar mbBar = new MenuBar();
	Menu me1,me2,me3;
	MenuItem m1,m2,m3,m4,m5,m6,m7,m8,m9,m10;
	MenuShortcut mShortcut = new MenuShortcut(KeyEvent.VK_X);
	MenuShortcut mShortcut2,mShortcut3,mShortcut4;
	CheckboxMenuItem ch = new CheckboxMenuItem("Box",true);
	
	public SubmenuProgram() {
		frame.setVisible(true);
		frame.setSize(500, 400);
		frame.setLayout( new FlowLayout());
		frame.setMenuBar(mbBar);
		frame.setTitle("Program");
		
		me1 = new  Menu("File");
		me2 = new  Menu("Edit");
		me3 = new Menu("English",true);
		mbBar.add(me1);
		mbBar.add(me2);
		
		mShortcut2 = new MenuShortcut(KeyEvent.VK_X);
		mShortcut3 = new MenuShortcut(KeyEvent.VK_C);
		mShortcut4 = new MenuShortcut(KeyEvent.VK_P);
		
		m1 = new MenuItem("New....");
		m2 = new MenuItem("Open...");
		m3 = new MenuItem("Save as");
		m4 = new MenuItem("Exit",mShortcut); // Added shortcut
		m5 = new MenuItem("Cut",mShortcut2);  // add Shortcut
		m6 = new MenuItem("Copy",mShortcut3); // add Shortcut
		m7 = new MenuItem("Paste",mShortcut4); // added shortcut
		m8 = new MenuItem("English");
		m9 = new MenuItem("Spelling ");
		m10 = new MenuItem("Grammer");
		me1.add(m1);
		me1.add(m2);
		me1.add(m3);
		me1.addSeparator();
		me1.add(m4);
		me2.add(m5);
		me2.add(m6);
		me2.add(m7);
		me2.add(ch);// add Check Box Menu Item With Checked
		me2.addSeparator();
		me2.add(me3);
		me3.add(m8);
		me3.add(m9);
		me3.add(m10);
		
		
		
	}
	
	
	
	
	
	public static void main(String args[]) {
		SubmenuProgram submenuProgram = new SubmenuProgram();
	}
	
}
