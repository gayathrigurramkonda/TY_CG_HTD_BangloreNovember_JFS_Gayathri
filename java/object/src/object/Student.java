package object;

public class Student {
	int Studid;
	String stuname;
	
	public Student(int studid, String stuname) {
		super();
		Studid = studid;
		this.stuname = stuname;
	}

	public String toString() {
		return"student name is:"+stuname+"student id is:"+Studid;
	}

}
