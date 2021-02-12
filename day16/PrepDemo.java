package day16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PrepDemo {

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
		//Statement st = null;
		PreparedStatement st = null;
		
		Scanner sc = new Scanner(System.in);
		//ResultSet rs= null;
		try {
			con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
			System.out.println("con established..");
			//st = con.createStatement();
			int i= 0;
			
			System.out.println("enter empid");
			int empid = sc.nextInt();
			
			System.out.println("enter salary");
			int sal = sc.nextInt();
			
			
			String query = "update employees set salary = ? where employee_id = ?";
			
			st=con.prepareStatement(query);
			st.setInt(1, sal);
			st.setInt(2, empid);
			i=st.executeUpdate();		
			
			//i=st.executeUpdate(query);
			
			System.out.println("rows updated="+i);
			
			query= "delete zensar where emp_id =2";
			
			i=st.executeUpdate(query);
			System.out.println("rows deleted="+i);
			
			query="insert into zensar (emp_id,first_name,last_name,salary) values(2,'pogesh','ramekar',1000000)";
			
			i=st.executeUpdate(query);
			System.out.println("rows inserted ="+i);
			
			
			//rs= st.executeQuery(query);
			/*while(rs.next())
			{
				System.out.println("employee_id="+rs.getInt(1)+"first_name ="+ rs.getString(2)+"last_name="+rs.getString(3));
			}*/
			con.commit();
		} catch (SQLException e) {
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
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
