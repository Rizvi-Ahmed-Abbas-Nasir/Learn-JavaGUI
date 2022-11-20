
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class DevicePC {
JFrame f;
DevicePC(){
f=new JFrame();
DefaultMutableTreeNode Root=new DefaultMutableTreeNode("This Pc");
DefaultMutableTreeNode n1=new DefaultMutableTreeNode("Desktop");
DefaultMutableTreeNode n2=new DefaultMutableTreeNode("Downloads");
DefaultMutableTreeNode n3=new DefaultMutableTreeNode("Local Disk C");
DefaultMutableTreeNode n4=new DefaultMutableTreeNode("New Volume E");
DefaultMutableTreeNode n5=new DefaultMutableTreeNode("New Volume F");
DefaultMutableTreeNode n6=new DefaultMutableTreeNode("Device CD");

DefaultMutableTreeNode sn1=new DefaultMutableTreeNode("Recycle Bin");
DefaultMutableTreeNode sn2=new DefaultMutableTreeNode("Pictures");
DefaultMutableTreeNode sn3=new DefaultMutableTreeNode("Program Files");
DefaultMutableTreeNode sn4=new DefaultMutableTreeNode("My Photos");
DefaultMutableTreeNode sn5=new DefaultMutableTreeNode("Videos");

Root.add(n1);
Root.add(n2);
Root.add(n3);
Root.add(n4);
Root.add(n5);
Root.add(n6);

n1.add(sn1);
n2.add(sn2);
n3.add(sn3);
n4.add(sn4);;
n5.add(sn5);


JTree jt=new JTree(Root);
f.add(jt);
f.setSize(300,300);
f.setVisible(true);
}
public static void main(String[] args) {
	DevicePC dP = new DevicePC();
}}