package ATM;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;

public class PinChange extends JFrame implements ActionListener{
  
	String pin;
	
	JFrame frame;
   
	JPasswordField entertf,rentertf ;
	
	JButton change,back;
       JLabel oldPin;
	private JPasswordField txtPIN;
	
	PinChange(String pin)
	{
		this.pin=pin;
		
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 17));
		frame.setBounds(400, 100, 800, 690);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel(" Change your PIN");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel.setBounds(257, 89, 342, 29);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New PIN:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_1.setBounds(156, 191, 116, 29);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Re-Enter PIN:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel_1_1.setBounds(156, 244, 139, 29);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		entertf = new JPasswordField();
		entertf.setBounds(322, 200, 150, 29);
		frame.getContentPane().add(entertf);
		entertf.setColumns(10);
		
		rentertf = new JPasswordField();
		rentertf.setColumns(10);
		rentertf.setBounds(322, 244, 150, 29);
		frame.getContentPane().add(rentertf);
		
		change = new JButton("CHANGE");
		change.setForeground(Color.WHITE);
		change.setFont(new Font("Tahoma", Font.PLAIN, 17));
		change.setBackground(Color.BLACK);
		change.setBounds(172, 424, 123, 30);
		frame.getContentPane().add(change);
		change.addActionListener(this);
		
		back= new JButton("BACK");
		back.setForeground(Color.WHITE);
		back.setFont(new Font("Tahoma", Font.PLAIN, 17));
		back.setBackground(Color.BLACK);
		back.setBounds(420, 424, 123, 30);
		frame.getContentPane().add(back);
		
		oldPin= new JLabel("Enter old  PIN:");
		oldPin.setFont(new Font("Tahoma", Font.BOLD, 19));
		oldPin.setBounds(145, 335, 150, 29);
		frame.getContentPane().add(oldPin);
		
		txtPIN = new JPasswordField();
		txtPIN.setColumns(10);
		txtPIN.setBounds(322, 335, 150, 29);
		frame.getContentPane().add(txtPIN);
		back.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae) {
		
		String pintxt=txtPIN.getText();
		
		if(ae.getSource()==change)
		{
		 if(pin.equals(pintxt))
		 {
		try {
			String newPin=entertf.getText();
			String RPin=rentertf.getText();
			
			if(!newPin.equals(RPin))
			{
				JOptionPane.showMessageDialog(null, "Entered Pin Does Not Match");
				return;
			}
			
			if(newPin.equals(""))
			{
				JOptionPane.showMessageDialog(null, "Please Enter new PIN");
				return;
			}
			
			if(RPin.equals(""))
			{
				JOptionPane.showMessageDialog(null, "Please Re-Enter new PIN");
				return;
			}
			
			Conn conn=new Conn();
			
			
			String query1="update bank set pin ='"+newPin+"' where pin='"+pin+"'";
			
			String query2="update login set pin ='"+newPin+"' where pin='"+pin+"'";
			
			String query3="update signupth set pin ='"+newPin+"' where pin='"+pin+"'";
			
			conn.s.executeUpdate(query1);
			conn.s.executeUpdate(query2);
			conn.s.executeUpdate(query3);
			
			JOptionPane.showMessageDialog(null, "PIN changed Successfully");
			
			setVisible(false);
			
			new Transaction(newPin).frame.setVisible(true);
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		 }
		  else if(!pin.equals(pintxt))
		  {
			  JOptionPane.showMessageDialog(null, "Please enter corect PIN");
		  }
		}
		else
		{
			setVisible(false);
			new Transaction(pin).frame.setVisible(true);
		}
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PinChange frame = new PinChange("");
					frame.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
