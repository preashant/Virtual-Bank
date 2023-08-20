package ATM;

import java.sql.*;
//import java.sql.DriverManager;

public class Conn {
	Connection c;
	Statement s;
	Conn()
	{
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			 c=DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagement","root","6101");
		      s=c.createStatement();
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
