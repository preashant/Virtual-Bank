package ATM;


	

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class TheStatement extends JFrame implements ActionListener{
 
	JFrame frame;
    JButton b1, b2;
    JLabel l1;
    TheStatement(String pin){
        super("Mini Statement");
      /*  getContentPane().setBackground(Color.WHITE);
        setSize(400,600);
        setLocation(20,20);*/
        
        frame = new JFrame();
    	frame.getContentPane().setBackground(new Color(255, 255, 255));
    	frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 17));
    	frame.setBounds(400, 100, 800, 690);
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.getContentPane().setLayout(null);
    	
    	JLabel
        
        l1 = new JLabel();
        add(l1);
        
        JLabel l2 = new JLabel("Indian Bank");
        l2.setBounds(150, 20, 100, 20);
        frame.getContentPane().add(l2);
        
        JLabel account = new JLabel();
    	account.setBounds(140, 167, 265, 24);
    	frame.getContentPane().add(account);
        
        JLabel l4 = new JLabel();
        l4.setBounds(20, 400, 300, 20);
        frame.getContentPane().add(l4);
        
        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from login where pin = '1122'");
            while(rs.next()){
               account.setText("Account Number:    " + rs.getString("cardno").substring(0, 4) + "XXXXXXXX" + rs.getString("accountno").substring(12,16));
            }
        }catch(Exception e){}
        	 
        try{
            int balance = 0;
            Conn c1  = new Conn();
            ResultSet rs = c1.s.executeQuery("SELECT * FROM bank where pin = '"+pin+"'");
            while(rs.next()){
                l1.setText(l1.getText() + "<html>"+rs.getString("date")+ "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("mode") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("amount") + "<br><br><html>");
                if(rs.getString("mode").equals("Deposit")){
                    balance += Integer.parseInt(rs.getString("amount"));
                }else{
                    balance -= Integer.parseInt(rs.getString("amount"));
                }
                }
                l4.setText("Your total Balance is Rs "+balance);
            }catch(Exception e){
                e.printStackTrace();
            }
            
            setLayout(null);
            b1 = new JButton("Exit");
            add(b1);
            
            b1.addActionListener(this);
            
            l1.setBounds(20, 140, 400, 200);
            b1.setBounds(20, 500, 100, 25);
        }
        public void actionPerformed(ActionEvent ae){
            this.setVisible(false);
        }
        
        public static void main(String[] args){
        	EventQueue.invokeLater(new Runnable() {
    			public void run() {
    				try {
    					TheStatement frame = new TheStatement("");
    					frame.frame.setVisible(true);
    				} catch (Exception e) {
    					e.printStackTrace();
    				}
    			}
    		});
        }

}
