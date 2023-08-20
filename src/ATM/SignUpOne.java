package ATM;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JTextField;


import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.Choice;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import com.toedter.calendar.*;
import javax.swing.JButton;
import java.awt.event.*;

public class SignUpOne extends JFrame implements ActionListener{

	 JFrame frame;
	 
	 long random;
	 
	 JTextField nametf,phonetf,addresstf,statetf,mailtf,pincodetf,citytf;
	 
	 JRadioButton marride,unmarride,others,male,female,other1;
	 
	 JButton nextbtn;
	 
	 JDateChooser datechosser;
 
	public SignUpOne() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 17));
		frame.setBounds(400, 100, 800, 690);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Random ran=new Random();
	     random=Math.abs((ran.nextLong()%9000L)+9000L);
		
		JLabel formNo = new JLabel("APPLICATION FORM NO: "+random);
		formNo.setFont(new Font("Tahoma", Font.BOLD, 35));
		formNo.setBounds(140, 20, 600, 40);
		frame.getContentPane().add(formNo);
		
		JLabel personalDetails = new JLabel("Page 1: Personal Details");
		personalDetails.setFont(new Font("Tahoma", Font.BOLD, 22));
		personalDetails.setBounds(290, 80, 400, 30);
		frame.getContentPane().add(personalDetails);
		
		JLabel name = new JLabel("Name:");
		name.setFont(new Font("Tahoma", Font.PLAIN, 20));
		name.setBounds(104, 132, 98, 21);
		frame.getContentPane().add(name);
		
		nametf = new JTextField();
		nametf.setBounds(276, 137, 210, 21);
		frame.getContentPane().add(nametf);
		nametf.setColumns(10);
		
		JLabel phone = new JLabel("Phone:");
		phone.setFont(new Font("Tahoma", Font.PLAIN, 20));
		phone.setBounds(104, 185, 98, 21);
		frame.getContentPane().add(phone);
		
		phonetf = new JTextField();
		phonetf.setColumns(10);
		phonetf.setBounds(276, 185, 210, 21);
		frame.getContentPane().add(phonetf);
		
		JLabel mail = new JLabel("Email:");
		mail.setFont(new Font("Tahoma", Font.PLAIN, 20));
		mail.setBounds(104, 230, 151, 19);
		frame.getContentPane().add(mail);
		
		
		mailtf = new JTextField();
		mailtf.setColumns(10);
		mailtf.setBounds(276, 230, 210, 21);
		frame.getContentPane().add(mailtf);
		
		JLabel dateOfBbirth = new JLabel("Date Of Birth :");
		dateOfBbirth.setFont(new Font("Tahoma", Font.PLAIN, 20));
		dateOfBbirth.setBounds(104, 323, 160, 21);//
		frame.getContentPane().add(dateOfBbirth);
		
		datechosser=new JDateChooser();
		datechosser.setBounds(276, 323, 210, 21);//
		frame.getContentPane().add(datechosser);
					
		JLabel gender = new JLabel(" Gender:");
		gender.setFont(new Font("Tahoma", Font.PLAIN, 20));
		gender.setBounds(104, 279, 160, 21);
		frame.getContentPane().add(gender);
		
		male=new JRadioButton();
		male.setText("Male");
		male.setBackground(new Color(255, 255, 255));
		male.setFont(new Font("Tahoma", Font.PLAIN, 18));
		male.setBounds(279, 283, 63, 21);
		frame.getContentPane().add(male);
		
		female=new JRadioButton();
		female.setText("Female");
		female.setFont(new Font("Tahoma", Font.PLAIN, 18));
		female.setBackground(Color.WHITE);
		female.setBounds(344, 283, 87, 21);
		frame.getContentPane().add(female);
		
		other1 = new JRadioButton();
		other1.setText("Other");
		other1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		other1.setBackground(Color.WHITE);
		other1.setBounds(433, 280, 87, 21);
		frame.getContentPane().add(other1);
		
		ButtonGroup genderGroup=new ButtonGroup();
		genderGroup.add(male);
		genderGroup.add(female);
		genderGroup.add(other1);
				
		JLabel address = new JLabel("Address:");
		address.setFont(new Font("Tahoma", Font.PLAIN, 20));
		address.setBounds(104, 413, 160, 21);
		frame.getContentPane().add(address);
		
        addresstf = new JTextField();
		addresstf.setColumns(10);
		addresstf.setBounds(276, 418, 210, 21);
		frame.getContentPane().add(addresstf);
		
		JLabel state = new JLabel("State:");
		state.setFont(new Font("Tahoma", Font.PLAIN, 20));
		state.setBounds(104, 497, 160, 21);
		frame.getContentPane().add(state);
		
		statetf = new JTextField();
		statetf.setColumns(10);
		statetf.setBounds(276, 497, 210, 21);
		frame.getContentPane().add(statetf);
		
			
		JLabel pincode = new JLabel("Pin Code:");
		pincode.setFont(new Font("Tahoma", Font.PLAIN, 20));
		pincode.setBounds(104, 542, 160, 21);
		frame.getContentPane().add(pincode);
		
		pincodetf = new JTextField();
		pincodetf.setColumns(10);
		pincodetf.setBounds(276, 547, 210, 21);
		frame.getContentPane().add(pincodetf);
		
	
		JLabel maritailStatues = new JLabel("Maritail Statues: ");
		maritailStatues.setFont(new Font("Tahoma", Font.PLAIN, 20));
		maritailStatues.setBounds(104, 367, 160, 21);
		frame.getContentPane().add(maritailStatues);
		
		marride=new JRadioButton();
		marride.setText("Marride");
		marride.setFont(new Font("Tahoma", Font.PLAIN, 18));
		marride.setBackground(Color.WHITE);
		marride.setBounds(258, 368, 87, 21);
		frame.getContentPane().add(marride);
		
		unmarride=new JRadioButton();
		unmarride.setText("Unmarride");
		unmarride.setFont(new Font("Tahoma", Font.PLAIN, 18));
		unmarride.setBackground(Color.WHITE);
		unmarride.setBounds(350, 370, 115, 17);
		frame.getContentPane().add(unmarride);
		
		others=new JRadioButton();
		others.setText("Other");
		others.setFont(new Font("Tahoma", Font.PLAIN, 18));
		others.setBackground(Color.WHITE);
		others.setBounds(467, 368, 87, 21);
		frame.getContentPane().add(others);
		
		ButtonGroup married=new ButtonGroup();
		married.add(others);
		married.add(marride);
		married.add(unmarride);
		
		JLabel city = new JLabel("City:");
	    city.setFont(new Font("Tahoma", Font.PLAIN, 20));
		city.setBounds(104, 456, 160, 21);
		frame.getContentPane().add(city);
		
		citytf = new JTextField();
		citytf.setColumns(10);
		citytf.setBounds(276, 461, 210, 21);
		frame.getContentPane().add(citytf);
		
		 nextbtn = new JButton("NEXT ");
		 nextbtn.setForeground(new Color(255, 255, 255));
		 nextbtn.setBackground(new Color(0, 0, 0));
		 nextbtn.setBounds(572, 596, 98, 30);
		 nextbtn.addActionListener(this);
		frame.getContentPane().add(nextbtn);
		
		
		
		
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		String formno=""+random;
		String name=nametf.getText();
		String email=mailtf.getText();
		String Mnumber=phonetf.getText();
		
		String dob=((JTextField)datechosser.getDateEditor().getUiComponent()).getText();
		
		String gender=null;
		if(male.isSelected())
		{
			gender="Male";
		}
		else if (female.isSelected())
		{
			gender="Female";
		}
		else if(other1.isSelected())
		{
			gender="Other";
		}  		
		String marital =null;
		if(marride.isSelected())
		{
			marital="Marrid";
		}
		else if(unmarride.isSelected())
		{
			marital="Unmarrid";
		}
		else if(others.isSelected())
		{
			marital="Other";
		}
		
		String address=addresstf.getText();
		
		String city=citytf.getText();
		
		String state=statetf.getText();
		
		String pincode=pincodetf.getText();
		
		try
		{
			if(name.equals(""))
			{
				JOptionPane.showMessageDialog(null,"Name is Required");
				SignUpOne s=new SignUpOne();
				s.frame.setVisible(true);
				setVisible(false);
				
			}
			else if(Mnumber.equals("") )
			{
				JOptionPane.showMessageDialog(null,"Mobile Number is Required");
			}
			else if(dob.equals(""))
			{
				JOptionPane.showMessageDialog(null,"Date Of Birth is Required");
			}
			
			else if(pincode.equals(""))
			{
				JOptionPane.showMessageDialog(null,"Pin Code is Required");
			}
			else if(email.equals(""))
			{
				JOptionPane.showMessageDialog(null,"Mail  is Required");
			}
			else if(gender.equals(""))
			{
				JOptionPane.showMessageDialog(null,"Gender  is Required");
			}
			else if(marital.equals(""))
			{
				JOptionPane.showMessageDialog(null,"Marital Status is Required");
			}
			else if(address.equals(""))
			{
				JOptionPane.showMessageDialog(null,"Address  is Required");
			}
			else if(city.equals(""))
			{
				JOptionPane.showMessageDialog(null,"City  is Required");
			}
			else if(state.equals(""))
			{
				JOptionPane.showMessageDialog(null,"State  is Required");
			}
			else
			{
				Conn c=new Conn();
				String  query="insert into signup values('"+formno+"','"+name+"','"+Mnumber+"','"+dob+"','"+gender+"','"+marital+"','"+address+"','"+city+"','"+state+"','"+pincode+"','"+email+"')";
			    
				c.s.execute(query);
				setVisible(false);
				new SignUpTwo(formno).frame.setVisible(true);
			}
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	
	 public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						SignUpOne frame = new SignUpOne();
						frame.frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				} 
			});
		
		}
	
}

