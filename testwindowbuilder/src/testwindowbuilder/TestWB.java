package testwindowbuilder;


import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestWB extends JFrame {

	
	public TestWB() {
		//setTitle("스윙 프레임 만들기");
		super("스윙 프레임 만들기");
		setSize(300,300);
		setVisible(true);
		
		Container contentPane = getContentPane();
		
		JButton button = new JButton("Click");
		contentPane.add(button);
		button.setSize(150, 50);
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		TestWB test = new TestWB();
	}


}//class
