package day16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.*;
class Student{//declare 5 fields
	int stid;
	String stname;
	int marks;
	int attendance;
	String remark;
	
	public Student(){}
	
	public Student(int stid, String stname, int marks, int attendance, String remark) {
		super();
		this.stid = stid;
		this.stname = stname;
		this.marks = marks;
		this.attendance = attendance;
		this.remark = remark;
	}
	public int getStid() {
		return stid;
	}
	public void setStid(int stid) {
		this.stid = stid;
	}
	public String getStname() {
		return stname;
	}
	public void setStname(String stname) {
		this.stname = stname;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public int getAttendance() {
		return attendance;
	}
	public void setAttendance(int attendance) {
		this.attendance = attendance;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	@Override
	public String toString() {
		return "Student [stid=" + stid + ", stname=" + stname + ", marks=" + marks + ", attendance=" + attendance
				+ ", remark=" + remark + "]";
	}
	
}
class Anotherclass extends Student{
	
	public Anotherclass() {}
	
	public Anotherclass(int stid, String stname, int marks, int attendance, String remark) {
		super(stid, stname, marks, attendance, remark);
		// TODO Auto-generated constructor stub
	}
	
	public void Input()//to take input in 5 fields
	{
	ArrayList<Student> al= new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	
	
		stid = sc.nextInt();
		stname =sc.nextLine();
		
		marks=sc.nextInt();
		
		attendance=sc.nextInt();
		remark=sc.nextLine();
	
	al.add(new Student(stid,stname,marks,attendance,remark));
		sc.close();
	}
	
	
}
public class StudentAssign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Anotherclass s = new Anotherclass();
		s.Input();
		
		//System.out.println(s.getStid());
			
		//System.out.println(s.getRemark());
				
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("driver loaded");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int i = 0;
		//take input dynamically
		String query =" insert into student values(?,?,?,?,?)";
		
		Connection con=null;		
		PreparedStatement st = null;
		try {
			st=con.prepareStatement(query);
			st.setInt(1,1);
			st.setString(2,"aditya");
			st.setInt(3,49);
			st.setInt(4,74);
			st.setString(5,"A");
			i=st.executeUpdate();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		System.out.println("rows updated="+i);
		
		
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
			st=con.prepareStatement(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
		try {
			st.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
		
	}

}
