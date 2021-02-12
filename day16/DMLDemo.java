package day16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DMLDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			// TODO Auto-generated method stub
			
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				System.out.println("driver loaded");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
			//oracle 11g -orcl oracle 10g xe
			Connection con = null;
			Statement st = null;
			//ResultSet rs= null;
			try {
				con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
				System.out.println("con established..");
				st = con.createStatement();
				int i= 0;
				
				String query = "update employees set salary = 90000 where employee_id = 206";
				System.out.println("hello");
				i=st.executeUpdate(query);
				
				System.out.println("rows updated="+i);
				
				query="insert into zensar (emp_id,first_name,last_name,salary) values(1,'piyush','ramekar',1000000)";
				
				i=st.executeUpdate(query);
				System.out.println("rows inserted ="+i);
				
				query= "delete zensar where first_name = 'dhanraj'";
				
				i=st.executeUpdate(query);
				System.out.println("rows deleted="+i);
				//rs= st.executeQuery(query);
				/*while(rs.next())
				{
					System.out.println("employee_id="+rs.getInt(1)+"first_name ="+ rs.getString(2)+"last_name="+rs.getString(3));
				}*/
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally {
				try {
					//rs.close();
					st.close();
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}
	}

}
