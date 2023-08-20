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
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
public class SignUpTwo extends JFrame implements ActionListener{
	

		 JFrame frame;
		 
		 
		 
		 JTextField pantf,adhatf;
		 
		 JRadioButton btnYes,btnNo,yes,no;
		 
		 JButton nextbtn;
		 
		 JDateChooser datechosser;
		 
	     JComboBox religion,catagory,income,qualification,occupation;
		String formno;
	 
		public SignUpTwo(String formno) {
			this.formno=formno;
			
			frame = new JFrame();
			frame.getContentPane().setBackground(new Color(255, 255, 255));
			frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 17));
			frame.setBounds(400, 100, 800, 690);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().setLayout(null);
			
			setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
			
			JLabel additionalDetails = new JLabel("Page 2: Additional Details");
			additionalDetails.setFont(new Font("Tahoma", Font.BOLD, 22));
			additionalDetails.setBounds(175, 80, 315, 30);
			frame.getContentPane().add(additionalDetails);
			
			JLabel adh = new JLabel("Aadhar Number:");
			adh.setFont(new Font("Tahoma", Font.PLAIN, 20));
			adh.setBounds(104, 132, 151, 21);
			frame.getContentPane().add(adh);
			
			adhatf = new JTextField();
			adhatf.setBounds(276, 137, 210, 21);
			frame.getContentPane().add(adhatf);
			adhatf.setColumns(10);
			
			JLabel pan = new JLabel("PAN Number:");
			pan.setFont(new Font("Tahoma", Font.PLAIN, 20));
			pan.setBounds(104, 185, 151, 21);
			frame.getContentPane().add(pan);
			
			pantf = new JTextField();
			pantf.setColumns(10);
			pantf.setBounds(276, 185, 210, 21);
			frame.getContentPane().add(pantf);
			
			JLabel inc = new JLabel("Income:");
			inc.setFont(new Font("Tahoma", Font.PLAIN, 20));
			inc.setBounds(104, 230, 151, 19);
			frame.getContentPane().add(inc);
			
			income = new JComboBox();
			income.setModel(new DefaultComboBoxModel(new String[] {"", "Null", "< 1,50,000", "< 2,50,000", "< 5,00,000", "upto 10,00,000"}));
			income.setBounds(276, 233, 214, 21);
			frame.getContentPane().add(income);
						
			JLabel qual = new JLabel(" Qualification:");
			qual.setFont(new Font("Tahoma", Font.PLAIN, 20));
			qual.setBounds(91, 279, 173, 21);
			frame.getContentPane().add(qual);
			
			qualification = new JComboBox();
			qualification.setModel(new DefaultComboBoxModel(new String[] {"", "Non-Graduation", "Graduation", "Post Graduation", "Doctorate", "Other", ""}));
			qualification.setBounds(276, 283, 214, 21);
			frame.getContentPane().add(qualification);
					
			JLabel address = new JLabel("Occupation:");
			address.setFont(new Font("Tahoma", Font.PLAIN, 20));
			address.setBounds(104, 413, 160, 21);
			frame.getContentPane().add(address);
			
			occupation = new JComboBox();
			occupation.setModel(new DefaultComboBoxModel(new String[] {"", "Salaried", "Self-Employed", "Bussiness", "Student", "Retired", "Other", ""}));
			occupation.setBounds(276, 417, 214, 21);
			frame.getContentPane().add(occupation);
			
			JLabel rel = new JLabel("Religion:");
			rel.setFont(new Font("Tahoma", Font.PLAIN, 20));
			rel.setBounds(104, 497, 160, 21);
			frame.getContentPane().add(rel);
			
			 religion = new JComboBox();
			religion.setModel(new DefaultComboBoxModel(new String[] {"", "Hindu", "Muslim", "Sikh", "Buddha", "Christian", "Other's "}));
		    religion.setBounds(276, 501, 214, 21);
			frame.getContentPane().add(religion);
			
				
			JLabel cat = new JLabel("Catagory:");
			cat.setFont(new Font("Tahoma", Font.PLAIN, 20));
			cat.setBounds(104, 542, 160, 21);
			frame.getContentPane().add(cat);
			
			catagory = new JComboBox();
			catagory.setModel(new DefaultComboBoxModel(new String[] {"", "OPEN", "OBC", "SC", "ST", "Other"}));
			catagory.setBounds(276, 546, 214, 21);
			frame.getContentPane().add(catagory);
		
			JLabel seniorCitizen = new JLabel("Senior Citizen: ");
			seniorCitizen.setFont(new Font("Tahoma", Font.PLAIN, 20));
			seniorCitizen.setBounds(104, 367, 160, 21);
			frame.getContentPane().add(seniorCitizen);
			
		    btnYes = new JRadioButton("Yes");
			btnYes.setFont(new Font("Tahoma", Font.PLAIN, 18));
			btnYes.setBounds(276, 371, 55, 21);
			frame.getContentPane().add(btnYes);
			
			btnNo = new JRadioButton("No");
			btnNo.setFont(new Font("Tahoma", Font.PLAIN, 18));
			btnNo.setBounds(379, 368, 64, 21);
			frame.getContentPane().add(btnNo);
			
			ButtonGroup citizen=new ButtonGroup();
			citizen.add(btnYes);
			citizen.add(btnNo);
			
			JLabel account = new JLabel("Exisiting:");
		    account.setFont(new Font("Tahoma", Font.PLAIN, 20));
			account.setBounds(104, 456, 160, 21);
			frame.getContentPane().add(account);
			
			yes = new JRadioButton("Yes");
			yes.setFont(new Font("Tahoma", Font.PLAIN, 18));
			yes.setBounds(278, 460, 55, 21);
			frame.getContentPane().add(yes);
			
			no = new JRadioButton("No");
			no.setFont(new Font("Tahoma", Font.PLAIN, 18));
			no.setBounds(379, 460, 55, 21);
			frame.getContentPane().add(no);
			
			ButtonGroup exisiting=new ButtonGroup();
			exisiting.add(yes);
			exisiting.add(no);	
			
			 nextbtn = new JButton("NEXT ");
			 nextbtn.setForeground(new Color(255, 255, 255));
			 nextbtn.setBackground(new Color(0, 0, 0));
			 nextbtn.setBounds(572, 596, 98, 30);
			 nextbtn.addActionListener(this);
			frame.getContentPane().add(nextbtn);
			
			
		}
		
		public void actionPerformed(ActionEvent ae)
		{
			
			String aadharNo=adhatf.getText();
			String panNo=pantf.getText();
			String vReligion=(String) religion.getSelectedItem();
			String vCatagory=(String) catagory.getSelectedItem();
			String vIncome=(String) income.getSelectedItem();
			String vQualification=(String) qualification.getSelectedItem();
			String vOccupation=(String) occupation.getSelectedItem();
			
			String siniourCitizon=null;
			if(btnYes.isSelected())
			{
				siniourCitizon="Yes";
			}
			else if (no.isSelected())
			{
				siniourCitizon="No";
			}
				
			String exisitingAccount="Null";
			if(yes.isSelected())
			{
				exisitingAccount="Yes";
			}
			else if(no.isSelected())
			{
			    exisitingAccount="No";	
			}
			
			try
			{
				if(aadharNo.equals(""))
				{
					JOptionPane.showMessageDialog(null,"Aadhar Number is Required");
					
				}
				else if(panNo.equals(""))
				{
					JOptionPane.showMessageDialog(null,"PAN Number is Required");
				}
				else if(vIncome.equals(""))
				{
					JOptionPane.showMessageDialog(null,"Income is Required");
				}
				else if(vQualification.equals(""))
				{
					JOptionPane.showMessageDialog(null,"Qualification is Required");
				}
				else if(vIncome.equals(""))
				{
					JOptionPane.showMessageDialog(null,"Income is Required");
				}
				
				else
				{
					Conn c=new Conn();
					String  query="insert into signupTwo values('"+formno+"','"+aadharNo+"','"+panNo+"','"+vReligion+"','"+vCatagory+"','"+vIncome+"','"+vQualification+"','"+vOccupation+"','"+siniourCitizon+"','"+exisitingAccount+"')";
					
					c.s.execute(query);
					
					setVisible(false);
					new SignUpThree(formno).frame.setVisible(true);
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
							SignUpTwo frame = new SignUpTwo("");
							frame.frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					} 
				});
			
			}
	}






