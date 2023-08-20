package ATM;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JButton;

public class FastCash extends JFrame implements ActionListener{
 JFrame frame;
 
 JLabel transaction;
 String pin;
 JButton btn2000,btn5000,btn10000,btn15000,btn20000,btn50000,btnExit;
 String amount;

public FastCash(String pin) {
	
	this.pin=pin;
	
	frame = new JFrame();
	frame.getContentPane().setBackground(new Color(255, 255, 255));
	frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 17));
	frame.setBounds(400, 100, 800, 690);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.getContentPane().setLayout(null);
	
	 transaction = new JLabel("Select  withdrwal Amount:");
	 transaction.setFont(new Font("Tahoma", Font.BOLD, 22));
	 transaction.setBounds(183, 103, 294, 24);
	frame.getContentPane().add(transaction);
		
	btn2000 = new JButton("2000");
	btn2000.setFont(new Font("Tahoma", Font.PLAIN, 17));
	btn2000.setForeground(Color.WHITE);
	btn2000.setBackground(Color.BLACK);
	btn2000.setBounds(166, 156, 147, 30);
	frame.getContentPane().add(btn2000);
	btn2000.addActionListener(this);
	
	btn5000 = new JButton("5000");
	btn5000.setFont(new Font("Tahoma", Font.PLAIN, 17));
	btn5000.setForeground(Color.WHITE);
	btn5000.setBackground(Color.BLACK);
	btn5000.setBounds(366, 156, 180, 30);
	frame.getContentPane().add(btn5000);
	btn5000.addActionListener(this);
	
	btn10000 = new JButton("10000");
	btn10000.setFont(new Font("Tahoma", Font.PLAIN, 17));
	btn10000.setForeground(Color.WHITE);
	btn10000.setBackground(Color.BLACK);
	btn10000.setBounds(167, 211, 146, 30);
	frame.getContentPane().add(btn10000);
	btn10000.addActionListener(this);
	
	btn15000 = new JButton("15000");
	btn15000.setFont(new Font("Tahoma", Font.PLAIN, 17));
	btn15000.setForeground(Color.WHITE);
	btn15000.setBackground(Color.BLACK);
	btn15000.setBounds(366, 211, 180, 30);
	frame.getContentPane().add(btn15000);
	btn15000.addActionListener(this);
	
	btn20000 = new JButton("20000");
	btn20000.setForeground(Color.WHITE);
	btn20000.setFont(new Font("Tahoma", Font.PLAIN, 17));
	btn20000.setBackground(Color.BLACK);
	btn20000.setBounds(167, 262, 146, 30);
	frame.getContentPane().add(btn20000);
	btn20000.addActionListener(this);
	
	btn50000 = new JButton("50000");
	btn50000.setForeground(Color.WHITE);
	btn50000.setFont(new Font("Tahoma", Font.PLAIN, 17));
	btn50000.setBackground(Color.BLACK);
	btn50000.setBounds(366, 262, 180, 30);
	frame.getContentPane().add(btn50000);
	btn50000.addActionListener(this);
	
	btnExit = new JButton("Exit");
	btnExit.setForeground(Color.WHITE);
	btnExit.setFont(new Font("Tahoma", Font.PLAIN, 17));
	btnExit.setBackground(Color.BLACK);
	btnExit.setBounds(272, 322, 146, 30);
	frame.getContentPane().add(btnExit);
	btnExit.addActionListener(this);
		
}
	
	

	/*public void actionPerformed(ActionEvent ae)
	{
	try {
		String amount=((JButton)ae.getSource()).getText().toString();
		
		Conn c=new Conn();
		ResultSet rs=c.s.executeQuery("select * from bank where pin = '"+pin+"'");
		int balance=0;
		while(rs.next())
		{
			if(rs.getString("type").equals("Deposit"))
			{
				balance+= Integer.parseInt(rs.getString("amount"));
			}
			else
			{
				balance-= Integer.parseInt(rs.getString("amount"));
			}
		}
		String num="17";
		if(ae.getSource() != btnExit && balance < Integer.parseInt(amount))
		{
			JOptionPane.showMessageDialog(null, "Insuffient Balance");
			return;
		}
		
		if(ae.getSource()==btnExit)
		{
			this.setVisible(false);
			new Transaction(pin).setVisible(true);
			
		}
		else
		{
			Date date=new Date();
			c.s.executeUpdate("insert into bank values('"+pin+"','"+date+"','withdrawal','"+amount+"')");
			JOptionPane.showMessageDialog(null, "Rs. "+amount+" Debited Successfully");
			
			setVisible(false);
			new Transaction(pin).setVisible(true);
		}
		
	}catch(Exception ex) {
	System.out.println(ex);
	}
	}*/

    public void actionPerformed(ActionEvent ae)
    {
    	
    	try {
    		if(ae.getSource()==btnExit)
		{
			this.setVisible(false);
			new Transaction(pin).frame.setVisible(true);
			
		}
    	else
    	{
    		 amount=((JButton)ae.getSource()).getText().toString();
    	}
    	Conn c=new Conn();
    	
    		
    		ResultSet rs=c.s.executeQuery("select * from bank where pin = '"+pin+"'");
    		int balance=0;
    		while(rs.next())
    		{
    			if(rs.getString("type").equals("Deposit"))
    			{
    				balance+= Integer.parseInt(rs.getString("amount"));
    			}
    			else
    			{
    				balance-= Integer.parseInt(rs.getString("amount"));
    			}
    		}
    		if(ae.getSource() != btnExit && balance < Integer.parseInt(amount))
    		{
    			JOptionPane.showMessageDialog(null, "Insuffient Balance");
    			return;
    		}
    		Date date=new Date();
    		String query="insert into bank values('"+pin+"','"+date+"','Withdrawal','"+amount+"')";
    		c.s.executeUpdate(query);
    		
    		JOptionPane.showMessageDialog(null, "Rs. "+amount+" Debited Successfully");
    		
    		setVisible(false);
			new Transaction(pin).frame.setVisible(true);
    		
    	}catch(Exception ex)
    	{
    		System.out.println(ex);
    	}
    }
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FastCash frame = new FastCash("");
					frame.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace(); 
				}
			}
		});
	}
}

