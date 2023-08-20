package ATM;

import java.awt.*;

import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.JTextField;
import javax.swing.JButton;

public class Login extends JFrame implements ActionListener   
{

	 JFrame frame;
	
	JButton btnSignIn,btnClear,btnSignUp;
	JTextField cardField;
	JPasswordField passwordField;

	public Login() {
		
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.getContentPane().setBackground(new Color(244, 244, 244));
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 14));
		frame.setBounds(400, 100, 800, 690);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome to MH BANK");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 34));
		lblNewLabel.setForeground(new Color(64, 0, 64));
		lblNewLabel.setBounds(228, 82, 400, 60);
		frame.getContentPane().add(lblNewLabel);
		
		cardField = new JTextField();
		cardField.setBounds(251, 196, 217, 24);
		frame.getContentPane().add(cardField);
		cardField.setColumns(10);
		
		JLabel lblCardno = new JLabel("Account Number:");
		lblCardno.setBackground(new Color(64, 0, 64));
		lblCardno.setForeground(new Color(64, 0, 64));
		lblCardno.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 25));
		lblCardno.setBounds(149, 196, 217, 24);
		frame.getContentPane().add(lblCardno);
		
		JLabel lblPin = new JLabel("PIN:");
		lblPin.setForeground(new Color(64, 0, 64));
		lblPin.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 25));
		lblPin.setBackground(new Color(64, 0, 64));
		lblPin.setBounds(149, 267, 217, 24);
		frame.getContentPane().add(lblPin);
		
		btnSignIn = new JButton("LOGIN");
		btnSignIn.setForeground(new Color(255, 255, 255));
		btnSignIn.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnSignIn.setBounds(251, 361, 93, 32);
		frame.getContentPane().add(btnSignIn);
		btnSignIn.setBackground(Color.black);
		btnSignIn.addActionListener(this);
		
		 btnClear = new JButton("CLEAR");
		btnClear.setForeground(new Color(255, 255, 255));
		btnClear.setBackground(new Color(0, 0, 0));
		btnClear.setBounds(383, 362, 85, 32);
		frame.getContentPane().add(btnClear);
		btnClear.setBackground(Color.black);
		btnClear.addActionListener(this);
		
		 btnSignUp = new JButton("SIGN UP");
		btnSignUp.setForeground(new Color(255, 255, 255));
		btnSignUp.setBounds(251, 427, 217, 32);
		frame.getContentPane().add(btnSignUp);
		btnSignUp.setBackground(Color.black);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(251, 267, 217, 26);
		frame.getContentPane().add(passwordField);
		btnSignUp.addActionListener(this);
		
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == this.btnClear)
		{
			cardField.setText("");
			passwordField.setText("");
		}
		else if(e.getSource() == this.btnSignIn)
		{
			Conn conn=new Conn();
			String accountNumber = cardField.getText();
			String pin = passwordField.getText();
			String query = "select * from login where accountno = '"+accountNumber+"' and pin = '"+pin+"'";
		try {
			ResultSet rs = conn.s.executeQuery(query);
            if(rs.next()){
                setVisible(false);
                new Transaction(pin).frame.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "Incorrect Card Number or PIN");
            }
		}catch(Exception ex) {
			System.out.println(ex);
		}
		}
		else if(e.getSource() == this.btnSignUp)
		{
			SignUpOne s=new SignUpOne();
			s.frame.setVisible(true);
			setVisible(false);
		}
		
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
