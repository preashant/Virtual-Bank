package ATM;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

import com.mysql.cj.x.protobuf.MysqlxNotice.Frame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Withdrawal extends JFrame implements ActionListener{

	JFrame frame;
	 JTextField textField;
	 JButton btnWithdrawal,btnBack;
	 String pin;
	 JPasswordField txtPIN;
public Withdrawal(String pin) {
	
	this.pin=pin;
	
	frame = new JFrame();
	frame.getContentPane().setBackground(new Color(255, 255, 255));
	frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 17));
	frame.setBounds(400, 100, 800, 690);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.getContentPane().setLayout(null);
	
	JLabel lblNewLabel = new JLabel(" Enter the amount you want to Withdrawal");
	lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
	lblNewLabel.setBounds(175, 91, 360, 29);
	frame.getContentPane().add(lblNewLabel);
	
	textField = new JTextField();
	textField.setBounds(262, 159, 169, 29);
	frame.getContentPane().add(textField);
	textField.setColumns(10);
	
	
	
	btnWithdrawal = new JButton("Withdraw");
	btnWithdrawal.setForeground(Color.WHITE);
	btnWithdrawal.setFont(new Font("Tahoma", Font.PLAIN, 17));
	btnWithdrawal.setBackground(Color.BLACK);
	btnWithdrawal.setBounds(202, 325, 123, 30);
	frame.getContentPane().add(btnWithdrawal);
	btnWithdrawal.addActionListener(this);
	
	btnBack = new JButton("Back");
	btnBack.setForeground(Color.WHITE);
	btnBack.setFont(new Font("Tahoma", Font.PLAIN, 17));
	btnBack.setBackground(Color.BLACK);
	btnBack.setBounds(393, 325, 112, 30);
	frame.getContentPane().add(btnBack);
	btnBack.addActionListener(this);
	
	JLabel lblPIN = new JLabel("Enter PIN:");
	lblPIN.setFont(new Font("Tahoma", Font.PLAIN, 16));
	lblPIN.setBounds(161, 249, 78, 23);
	frame.getContentPane().add(lblPIN);
	
	txtPIN = new JPasswordField();
	txtPIN.setBounds(262, 243, 169, 29);
	frame.getContentPane().add(txtPIN);
	txtPIN.setColumns(10);
	txtPIN.addActionListener(this);
	
	
}
	public void actionPerformed(ActionEvent ae)
	{
		String pintxt=txtPIN.getText();
		
	if(ae.getSource()== btnWithdrawal )
	{
		if(pin.equals(pintxt))
		  {
		String amount=textField.getText();
		Date date=new Date();
		if(amount.equals(""))
		{
			JOptionPane.showMessageDialog(null,"Please Enter Amount You want to Withdrawal");
		}
		else
		{
			try {
				
				Conn conn=new Conn();
				String query="insert into bank values('"+pin+"','"+date+"','Withdrawal','"+amount+"')";
				conn.s.execute(query);
				 JOptionPane.showMessageDialog(null, "Rs. "+amount+" Withdrawal Successfully");
	             setVisible(false);
	             new Transaction(pin).frame.setVisible(true);
		}catch(Exception ex)
			{
			  System.out.println(ex);
			}
		}
		  }
		  else if(!pin.equals(pintxt))
		  {
			  JOptionPane.showMessageDialog(null, "Please enter corect PIN");
		  }
	}
	else if(ae.getSource() == btnBack)
	{
		setVisible(false);
		new Transaction(pin).frame.setVisible(true);
	}
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Withdrawal frame = new Withdrawal("");
					frame.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}

