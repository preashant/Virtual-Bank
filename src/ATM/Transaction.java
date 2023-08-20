package ATM;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JButton;

public class Transaction extends JFrame implements ActionListener{
 JFrame frame;
 
 JLabel transaction;
 String pin;
 JButton btnDeposit,btnCashWithdrawal,btnFastCash,btnMiniStatement,btnPinChange,btnBalanceEnquiry,btnExit;
public Transaction(String pin) {
	
	this.pin=pin;
	
	frame = new JFrame();
	frame.getContentPane().setBackground(new Color(255, 255, 255));
	frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 17));
	frame.setBounds(400, 100, 800, 690);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.getContentPane().setLayout(null);
	
	 transaction = new JLabel("Select  Your Trasaction:");
	 transaction.setFont(new Font("Tahoma", Font.BOLD, 22));
	 transaction.setBounds(183, 103, 294, 24);
	frame.getContentPane().add(transaction);
		
	btnDeposit = new JButton("Deposit");
	btnDeposit.setFont(new Font("Tahoma", Font.PLAIN, 17));
	btnDeposit.setForeground(Color.WHITE);
	btnDeposit.setBackground(Color.BLACK);
	btnDeposit.setBounds(166, 156, 147, 30);
	frame.getContentPane().add(btnDeposit);
	btnDeposit.addActionListener(this);
	
	btnCashWithdrawal = new JButton("Cash Withdrawal ");
	btnCashWithdrawal.setFont(new Font("Tahoma", Font.PLAIN, 17));
	btnCashWithdrawal.setForeground(Color.WHITE);
	btnCashWithdrawal.setBackground(Color.BLACK);
	btnCashWithdrawal.setBounds(366, 156, 180, 30);
	frame.getContentPane().add(btnCashWithdrawal);
	btnCashWithdrawal.addActionListener(this);
	
	btnFastCash = new JButton("Fast Cash");
	btnFastCash.setFont(new Font("Tahoma", Font.PLAIN, 17));
	btnFastCash.setForeground(Color.WHITE);
	btnFastCash.setBackground(Color.BLACK);
	btnFastCash.setBounds(167, 211, 146, 30);
	frame.getContentPane().add(btnFastCash);
	btnFastCash.addActionListener(this);
	
	btnMiniStatement = new JButton("Mini Statement");
	btnMiniStatement.setFont(new Font("Tahoma", Font.PLAIN, 17));
	btnMiniStatement.setForeground(Color.WHITE);
	btnMiniStatement.setBackground(Color.BLACK);
	btnMiniStatement.setBounds(366, 211, 180, 30);
	frame.getContentPane().add(btnMiniStatement);
	btnMiniStatement.addActionListener(this);
	
	btnPinChange = new JButton("PIN Change");
	btnPinChange.setForeground(Color.WHITE);
	btnPinChange.setFont(new Font("Tahoma", Font.PLAIN, 17));
	btnPinChange.setBackground(Color.BLACK);
	btnPinChange.setBounds(167, 262, 146, 30);
	frame.getContentPane().add(btnPinChange);
	btnPinChange.addActionListener(this);
	
	btnBalanceEnquiry = new JButton("Balance Enquiry ");
	btnBalanceEnquiry.setForeground(Color.WHITE);
	btnBalanceEnquiry.setFont(new Font("Tahoma", Font.PLAIN, 17));
	btnBalanceEnquiry.setBackground(Color.BLACK);
	btnBalanceEnquiry.setBounds(366, 262, 180, 30);
	frame.getContentPane().add(btnBalanceEnquiry);
	btnBalanceEnquiry.addActionListener(this);
	
	btnExit = new JButton("Exit");
	btnExit.setForeground(Color.WHITE);
	btnExit.setFont(new Font("Tahoma", Font.PLAIN, 17));
	btnExit.setBackground(Color.BLACK);
	btnExit.setBounds(272, 322, 146, 30);
	frame.getContentPane().add(btnExit);
	btnExit.addActionListener(this);
		
}
	
	public void actionPerformed(ActionEvent ae)
	{
	 if(ae.getSource()==btnExit)
	 {
		 System.exit(0);
	 }
	 else if(ae.getSource()== btnDeposit)
	 {
		 setVisible(false);
		 new Deposit(pin).frame.setVisible(true); 
	 }
	 else if(ae.getSource()== btnCashWithdrawal)
	 {
		setVisible(false);
		 new Withdrawal(pin).frame.setVisible(true); 
	 }
	 else if(ae.getSource() == btnFastCash)
	 {
		 setVisible(false);
		 new FastCash(pin).frame.setVisible(true);
	 }
	 else if(ae.getSource() == btnPinChange)
	 {
		 setVisible(false);
		 new PinChange(pin).frame.setVisible(true);
	 }
	 else if(ae.getSource() == btnBalanceEnquiry)
	 {
		 setVisible(false);
		 new Balance(pin).frame.setVisible(true);
	 }
	 else if(ae.getSource() == btnMiniStatement)
	 {
		 setVisible(false);
		 new MiniStatement(pin).frame.setVisible(true);
	 }
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Transaction frame = new Transaction("");
					frame.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
