package ATM;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JLabel;
import java.awt.Font;
import java.sql.ResultSet;

public class MiniStatement extends JFrame {
   JFrame frame;
public MiniStatement(String pin) {
	getContentPane().setLayout(null);
	
	
//	getContentPane().setLayout(null);

	frame = new JFrame();
	frame.getContentPane().setBackground(new Color(255, 255, 255));
	frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 17));
	frame.setBounds(400, 100, 800, 690);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.getContentPane().setLayout(null);
	
	JLabel bank = new JLabel("MH Bank");
	bank.setBounds(171, 62, 223, 40);
	frame.getContentPane().add(bank);
	
	JLabel account = new JLabel();
	account.setBounds(140, 167, 265, 24);
	frame.getContentPane().add(account);
	
	JLabel mini = new JLabel();
	mini.setBounds(140, 260, 490, 138);
	frame.getContentPane().add(mini);
	
	
	
	
	
	try {
		 // int balance=0;
		Conn conn=new Conn();
		ResultSet rs= conn.s.executeQuery("select * from bank where pin = '6104'");
		while(rs.next()) {
			mini.setText(mini.getText() + "<html> "+ rs.getString("timeDate") +"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+rs.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+rs.getString("amonut")/*+"<br><br><html>*/);
		/*  if(rs.getString("type").equals("deposit"))
		  {
			  balance +=Integer.parseInt(rs.getString("amount"));
		  }else
		  {
			  balance -=Integer.parseInt(rs.getString("amount"));
		  }
		}*/
		
		}}catch(Exception e)
	{
		System.out.println(e);
	}
try {
		
		Conn conn=new Conn();
		ResultSet rs= conn.s.executeQuery("select * from login where pin = '6104'");
		while(rs.next()) {
			account.setText("Account Number: "+rs.getString("accountno").substring(0,4)+"XXXXXXXX"+rs.getString("accountno").substring(12,16));
		}
		
	}catch(Exception ex)
	{
		System.out.println(ex);
	}
	
		
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MiniStatement frame = new MiniStatement("");
					frame.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
