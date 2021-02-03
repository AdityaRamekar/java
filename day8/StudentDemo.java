package day8;

class Student{
	private int rollno;
	private String name;
	private int marks;
	
	public void setMarks(int marks) {
		this.marks = marks;
	}

	public int getRollno() {
		return rollno;
	}

	public String getName() {
		return name;
	}

	public int getMarks() {
		return marks;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}

	public Student(int rollno, String name, int marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
}
public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st=new Student(1,"priti",70);
		System.out.println(st);
		System.out.println("marks="+st.getMarks()+"name ="+st.getName());
		st.setMarks(75);
		System.out.println("marks="+st.getMarks()+"name ="+st.getName());
	}

}
