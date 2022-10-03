package testwindowbuilder;

import java.awt.*;
import javax.swing.*;

public class BorderLayoutEx extends JFrame {
	public BorderLayoutEx() {
		setTitle("BorderLayout Example"); //BorderLayout 배치관리자 : 동,서,남,북,중앙
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		
		contentPane.setLayout(new BorderLayout(35,20));
		
		contentPane.add(new JButton("Calculate"), BorderLayout.CENTER);
		contentPane.add(new JButton("MUL"), BorderLayout.EAST);
		contentPane.add(new JButton("DIV"), BorderLayout.WEST);
		contentPane.add(new JButton("SUB"), BorderLayout.SOUTH);
		contentPane.add(new JButton("ADD"), BorderLayout.NORTH);
		
		setSize(300,250);
		setVisible(true);
	}

	
	public static void main(String[] args) {
		new BorderLayoutEx();
	}
}
