package day15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectDemo {

	public static void main(String[] args) {
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
		ResultSet rs= null;
		try {
			con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
			System.out.println("con established..");
			
			String query = "select * from employees";
			
			st = con.createStatement();
			rs= st.executeQuery(query);
			while(rs.next())
			{
				System.out.println("employee_id="+rs.getInt(1)+"first_name ="+ rs.getString(2)+"last_name="+rs.getString(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				rs.close();
				st.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
