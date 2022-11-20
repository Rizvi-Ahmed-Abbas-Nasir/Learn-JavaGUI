


import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
public class citiesTree {
JFrame f;
citiesTree(){
f=new JFrame();
DefaultMutableTreeNode Root=new DefaultMutableTreeNode("India");
DefaultMutableTreeNode maha=new DefaultMutableTreeNode("Maharasthra");
DefaultMutableTreeNode Gur=new DefaultMutableTreeNode("Gurjath");

Root.add(maha);
Root.add(Gur);

DefaultMutableTreeNode red=new DefaultMutableTreeNode("Mumbai");
DefaultMutableTreeNode blue=new DefaultMutableTreeNode("Pune");
DefaultMutableTreeNode black=new DefaultMutableTreeNode("Nashik");
DefaultMutableTreeNode green=new DefaultMutableTreeNode("Nagpur");
maha.add(red);
maha.add(blue); 
maha.add(black);
maha.add(green);
JTree jt=new JTree(Root);
f.add(jt);
f.setSize(300,300);
f.setVisible(true);
}
public static void main(String[] args) {
	citiesTree  cc = new citiesTree();
}}