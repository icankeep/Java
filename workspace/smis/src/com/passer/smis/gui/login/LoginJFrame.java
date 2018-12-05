package com.passer.smis.gui.login;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.passer.smis.gui.main.MainJFrame;

public class LoginJFrame extends JFrame {

	private JPanel contentPane;
	private JTextField usernameJTextField;
	private JTextField passwordJTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new LoginJFrame();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginJFrame() {
		setTitle("登陆");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400,150, 496, 294);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		usernameJTextField = new JTextField();
		usernameJTextField.setBounds(173, 82, 131, 33);
		contentPane.add(usernameJTextField);
		usernameJTextField.setColumns(10);
		
		JLabel lblAdmin = new JLabel("username : ");
		lblAdmin.setFont(new Font("SimSun-ExtB", Font.PLAIN, 20));
		lblAdmin.setBounds(55, 75, 146, 42);
		contentPane.add(lblAdmin);
		
		JLabel lblPassword = new JLabel("password :");
		lblPassword.setFont(new Font("SimSun-ExtB", Font.PLAIN, 20));
		lblPassword.setBounds(55, 127, 207, 29);
		contentPane.add(lblPassword);
		
		passwordJTextField = new JTextField();
		passwordJTextField.setColumns(10);
		passwordJTextField.setBounds(173, 125, 131, 33);
		contentPane.add(passwordJTextField);
		
		JButton loginButton = new JButton("login");
		loginButton.setFont(new Font("宋体", Font.PLAIN, 15));
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		loginButton.setBounds(310, 194, 93, 23);
		contentPane.add(loginButton);
		
		setVisible(true);
	}
	
}
