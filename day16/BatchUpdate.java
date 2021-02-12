package day16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchUpdate {

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
		//ResultSet rs= null;
		try {
			con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
			System.out.println("con established..");
			st = con.createStatement();
			
			String query = "update employees set salary = 90000 where employee_id = 206";
			st.addBatch(query);
			query="insert into zensar (emp_id,first_name,last_name,salary) values(1,'piyush','ramekar',1000000)";
			st.addBatch(query);
			query= "delete zensar where emp_id = 2";
			st.addBatch(query);
			
			int arr[]= st.executeBatch();
			
			for(int i:arr)
			{
			System.out.println("rows updated="+i);
			}
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
