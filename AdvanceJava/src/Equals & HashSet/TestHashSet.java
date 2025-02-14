package assignments;

import java.util.HashSet;
import java.util.Set;

public class TestHashSet {
	public static void main(String[] args) {
		
		Student s1 = new Student(1, "User1", 123);
		Student s2 = new Student(2, "User2", 234);
		Student s3 = new Student(1, "User1", 123);
	
	System.out.println(s1.equals(s3));
	
	Set<Student> set= new HashSet<>();
	set.add(s1);
	set.add(s2);
	set.add(s3);
	
	
	set.forEach(stu->System.out.println(stu));

	//	for(Student s:set) {
//		System.out.println(s);
//	}
	
	
	
	}
  
}
