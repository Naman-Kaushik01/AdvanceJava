package assignments;

import java.util.Objects;

public class Student {
	int id;
	String Name;
	float Salary;
	
	public Student(int id, String name, float salary) {
		super();
		this.id = id;
		this.Name = name;
		this.Salary = salary;
	}
 
	@Override
	public int hashCode() {
		return Objects.hash(Name, Salary, id);
	}

	@Override
	public boolean equals(Object obj) {
		
		Student other = (Student) obj;
		return Objects.equals(Name, other.Name);
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", Name=" + Name + ", Salary=" + Salary + "]";
	}
	

}
