package ATM;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class Balance extends JFrame implements ActionListener{
           JFrame frame;
           
           JButton btnback;
           
           String pin;
           
	public Balance(String pin) {
		
		this.pin=pin;
	
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 17));
		frame.setBounds(400, 100, 800, 690);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		btnback = new JButton("Back");
		btnback.setForeground(Color.WHITE);
		btnback.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnback.setBackground(Color.BLACK);
		btnback.setBounds(272, 322, 146, 30);
		frame.getContentPane().add(btnback);
		btnback.addActionListener(this);
		
		Conn c=new Conn();
		int balance=0;
		try {
			ResultSet rs=c.s.executeQuery("select * from bank where pin = '"+pin+"'");
			
			while(rs.next())
    		{
    			if(rs.getString("type").equals("Deposit"))
    			{
    				balance += Integer.parseInt(rs.getString("amount"));
    			}
    			else
    			{
    				balance -= Integer.parseInt(rs.getString("amount"));
    			}
    		}
		
			
		}catch(Exception ex)
		{
			System.out.println(ex);
		}
		
		JLabel text=new JLabel("Your Current Account Balance is Rs  "+balance);
		text.setFont(new Font("Tahoma", Font.BOLD, 19));
		text.setForeground(Color.black);
		text.setBounds(194, 113, 400, 30);
		frame.getContentPane().add(text);
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		setVisible(false);
		new Transaction(pin).frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Balance frame = new Balance("");
					frame.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
