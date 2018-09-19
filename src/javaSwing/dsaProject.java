package javaSwing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.awt.Container;
import java.awt.FlowLayout;

public class dsaProject extends JFrame {
	private JButton b1;
	private JButton b2;
	static JButton b;
	static JLabel l;
	static JTextField t;
	public dsaProject() {
		super("Data Structure");

		Container container = getContentPane();
		container.setLayout(new FlowLayout());
		b1 = new JButton("Single Linked List");
		container.add(b1);
		b2 = new JButton("Double Linked List");
		container.add(b2);
		ButtonHandler handler = new ButtonHandler();
		b1.addActionListener(handler);
		b2.addActionListener(handler);
		setSize(400, 150);
		setVisible(true);

	}

	public static void main(String args[]) {
		dsaProject dsa = new dsaProject();
		dsa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private class ButtonHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==b1) {
			JFrame secondFrame = new JFrame("Single Linked List");
			JPanel p= new JPanel();
			l=new JLabel("displaying List:");
			t = new JTextField(16);
			p.add(l);
			p.add(t);
			secondFrame.add(p);
			secondFrame.setSize(600, 500);
			secondFrame.setVisible(true);
			dispose();}
			else if(e.getSource()==b2) {
				JFrame secondFrame = new JFrame("Double Linked List");
				secondFrame.setSize(600, 500);
				secondFrame.setVisible(true);
				dispose();}
		}
	}
}
