package ATM;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import javax.swing.JButton;

public class SignUpThree extends JFrame implements ActionListener{
	
	JFrame frame;
	
	JCheckBox ATMCardbtn,IBnakingbtn,MBankingbtn,alertsbtn,checkBookbtn,estatementbtn,declarationbtn;
	
	JButton btnCancel,btnSubmit;
	
	JLabel additionalDetails,accounttype,lblAccountNumber,lblNumber,lblPin,lblP;
	
	JRadioButton rdbtnSavingAccount,rdbtnCurrentAccount,rdbtnFixedDepositAccount,rdbtnRecurringDepositAccount;

	 String formno;
	
	public SignUpThree(String formno) {
		
		this.formno=formno;
		
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 17));
		frame.setBounds(400, 100, 800, 690);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
		
		additionalDetails = new JLabel("Page 3: Account Details");
		additionalDetails.setFont(new Font("Tahoma", Font.BOLD, 22));
		additionalDetails.setBounds(220, 43, 315, 30);
		frame.getContentPane().add(additionalDetails);
		
		accounttype = new JLabel("Account Type:");
		accounttype.setFont(new Font("Tahoma", Font.BOLD, 22));
		accounttype.setBounds(85, 106, 217, 30);
		frame.getContentPane().add(accounttype);
		
		rdbtnSavingAccount = new JRadioButton();
		rdbtnSavingAccount.setText("Saving Account");
		rdbtnSavingAccount.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtnSavingAccount.setBackground(Color.WHITE);
		rdbtnSavingAccount.setBounds(113, 153, 168, 21);
		frame.getContentPane().add(rdbtnSavingAccount);
		
		rdbtnCurrentAccount = new JRadioButton();
		rdbtnCurrentAccount.setText("Current Account");
		rdbtnCurrentAccount.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtnCurrentAccount.setBackground(Color.WHITE);
		rdbtnCurrentAccount.setBounds(113, 187, 168, 21);
		frame.getContentPane().add(rdbtnCurrentAccount);
		
		rdbtnFixedDepositAccount = new JRadioButton();
		rdbtnFixedDepositAccount.setText("Fixed Deposit Account");
		rdbtnFixedDepositAccount.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtnFixedDepositAccount.setBackground(Color.WHITE);
		rdbtnFixedDepositAccount.setBounds(294, 156, 217, 21);
		frame.getContentPane().add(rdbtnFixedDepositAccount);
		
		ButtonGroup type=new ButtonGroup();
		type.add(rdbtnCurrentAccount);
		type.add(rdbtnSavingAccount);
		type.add(rdbtnFixedDepositAccount);
		type.add(rdbtnRecurringDepositAccount);
		
		rdbtnRecurringDepositAccount = new JRadioButton();
		rdbtnRecurringDepositAccount.setText("Recurring Deposit Account");
		rdbtnRecurringDepositAccount.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtnRecurringDepositAccount.setBackground(Color.WHITE);
		rdbtnRecurringDepositAccount.setBounds(294, 190, 251, 21);
		frame.getContentPane().add(rdbtnRecurringDepositAccount);
		
		lblAccountNumber = new JLabel("Account Number:");
		lblAccountNumber.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblAccountNumber.setBounds(71, 253, 217, 30);
		frame.getContentPane().add(lblAccountNumber);
		
		lblNumber = new JLabel("XXXX-XXXX-XXXX-XXXX");
		lblNumber.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNumber.setBounds(325, 265, 185, 13);
		frame.getContentPane().add(lblNumber);
		
		lblPin = new JLabel("Pin:");
		lblPin.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblPin.setBounds(71, 303, 99, 30);
		frame.getContentPane().add(lblPin);
		
		lblP = new JLabel("XXXX");
		lblP.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblP.setBounds(325, 317, 45, 13);
		frame.getContentPane().add(lblP);
		
		JLabel lblNewLabel_4 = new JLabel("Services Required :");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_4.setBounds(71, 365, 231, 21);
		frame.getContentPane().add(lblNewLabel_4);
		
		 ATMCardbtn = new JCheckBox("ATM Card");
		ATMCardbtn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		ATMCardbtn.setBounds(113, 415, 122, 21);
		frame.getContentPane().add(ATMCardbtn);
		
		 IBnakingbtn = new JCheckBox("Internate Banking");
		IBnakingbtn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		IBnakingbtn.setBounds(294, 415, 185, 21);
		frame.getContentPane().add(IBnakingbtn);
		
		 MBankingbtn = new JCheckBox("Mobile Banking");
		 MBankingbtn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		 MBankingbtn.setBounds(113, 459, 155, 21);
		frame.getContentPane().add( MBankingbtn);
		
		 alertsbtn = new JCheckBox("Email & SMS alerts ");
		alertsbtn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		alertsbtn.setBounds(294, 459, 185, 21);
		frame.getContentPane().add(alertsbtn);
		
	    checkBookbtn = new JCheckBox("Check Book");
		checkBookbtn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		checkBookbtn.setBounds(113, 502, 122, 21);
		frame.getContentPane().add(checkBookbtn);
		
		estatementbtn = new JCheckBox("E-Statement");
		estatementbtn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		estatementbtn.setBounds(294, 505, 127, 21);
		frame.getContentPane().add(estatementbtn);
		
		 declarationbtn = new JCheckBox("I hereby declares  that the above entered detail's are correct to the my best of knowledge ");
		 declarationbtn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		 declarationbtn.setBounds(71, 556, 619, 21);
		frame.getContentPane().add( declarationbtn);
		
		btnCancel = new JButton("Go to Login ");
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCancel.setForeground(Color.WHITE);
		btnCancel.setBackground(Color.BLACK);
		btnCancel.setBounds(424, 608, 168, 30);
		frame.getContentPane().add(btnCancel);
		btnCancel.addActionListener(this);
		
		btnSubmit = new JButton("Submit");
		btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSubmit.setForeground(Color.WHITE);
		btnSubmit.setBackground(Color.BLACK);
		btnSubmit.setBounds(137, 608, 98, 30);
		frame.getContentPane().add(btnSubmit);
		btnSubmit.addActionListener(this);
	}

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()== btnSubmit)
		{
			String accountType=null;
			if(rdbtnSavingAccount.isSelected())
			{
				accountType="Saving Account";
			}
			else if(rdbtnCurrentAccount.isSelected())
			{
				accountType="Current Account";
			}
			else if(rdbtnFixedDepositAccount.isSelected())
			{
				accountType="Fixed Deposit Account";
			}
			else if(rdbtnRecurringDepositAccount.isSelected())
			{
				accountType="Recurring Deposit Account";
			}
			Random random=new Random();
			
			 
			 long first7 = (random.nextLong() % 90000000L) + 5040936000000000L;
		        String accountNumber = "" + Math.abs(first7);
			
			String pin=""+Math.abs((random.nextLong()% 9000L)+1000L);
			
			String facility="";
			if( ATMCardbtn.isSelected() )
			{
				facility=facility+"ATM Card";
			}
			else if( IBnakingbtn.isSelected() )
			{
				facility=facility+" Internate Banking";
			}
			else if( MBankingbtn.isSelected() )
			{
				facility=facility+"Mobile Banking";
			}
			else if( alertsbtn.isSelected() )
			{
				facility=facility+"SMS & email Alters";
			}
			else if( checkBookbtn.isSelected() )
			{
				facility=facility+"Check Book";
			}
			else if( estatementbtn.isSelected() )
			{
				facility=facility+"E-Statement";
			}
			try {
				if(accountType.equals(""))
					{
					JOptionPane.showMessageDialog(null,"Account type is Required");
	
					}
				else {
					Conn c=new Conn();
					String  query="insert into signupThree values('"+formno+"','"+accountType+"','"+accountNumber+"','"+pin+"','"+facility+"')";
					 String query2 = "insert into login values('"+formno+"','"+accountNumber+"','"+pin+"')";
					c.s.execute(query);
					c.s.execute(query2);
					
					JOptionPane.showMessageDialog(null, "Account Number: " + accountNumber + "\n Pin:"+ pin);
					
					new Deposit(pin).setVisible(true);
					setVisible(false);
				}
				}catch(Exception e) {
				  System.out.println(e);
				}
			}
		else if(ae.getSource()== btnCancel)
		{
			new Login().frame.setVisible(true);
			setVisible(false);
		}
	}
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUpThree frame = new SignUpThree("");
					frame.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
