package testwindowbuilder;

import java.awt.*;
import javax.swing.*;

public class ContentPaneEx extends JFrame {
	public ContentPaneEx() {
		setTitle("ContentPane과 JFrame 예제"); //프레임타이틀
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container contentPane = getContentPane();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setLayout(new FlowLayout());

		contentPane.add(new JButton("OK")); //button 달기
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("lgnore"));

		setSize(400,150); //프레임 사이즈 설정
		setVisible(true); //화면에 프레임출력

	}


	public static void main(String[] args) {
		new ContentPaneEx();
	}
}
