package login;

import java.awt.*;
import javax.swing.*;

public class Login extends JFrame {
	private Login() {
		setTitle("login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();
		contentPane.setLayout(null);
		
		//contentPane.setLayout(new FlowLayout(FlowLayout.CENTER,50,30));
		
		JLabel la = new JLabel("아이디 :");
		la.setBounds(30, 30, 50, 30);
		contentPane.add(la);
		
		JTextField TextField = new JTextField();
		TextField.setBounds(100, 35, 120, 20);
		contentPane.add(TextField);
		
		JLabel la_1 = new JLabel("비밀번호 :");
		la_1.setBounds(30, 80, 100, 30);
		contentPane.add(la_1); 
		
		JPasswordField PasswordField = new JPasswordField();
		PasswordField.setBounds(100, 85, 120, 20);
		contentPane.add(PasswordField);
		
		JButton button = new JButton("로그인");
		contentPane.add(button);
		button.setBounds(30, 140, 100, 30);
		
		JButton button_1 = new JButton("회원가입");
		contentPane.add(button_1);
		button_1.setBounds(150, 140, 100, 30);		
		
		
		setSize(300,250);
		setVisible(true);
	}
	 

	public static void main(String[] args) {
		new Login();

	}

}
