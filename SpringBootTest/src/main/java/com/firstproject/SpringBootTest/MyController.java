package com.firstproject.SpringBootTest;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	
	
	@Autowired
	employeeRepo repo;
	
	@RequestMapping("/add")
	public String addData(Employee emp) {
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Enter Name");
		String name=scanner.next();
		
		System.out.println("Enter Work");
		String work=scanner.next();
		
		System.out.println("Enter Name");
		float salary=scanner.nextFloat();
		
		emp.setName(name);
		emp.setWork(work);
		emp.setSalary(salary);
		
		repo.save(emp);
		return "Data Added";
	}
	
	@RequestMapping("/show")
	
	public List<Employee> showData(){
		List<Employee> list=repo.findAll();
		for(Employee emp: list) {
			System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getWork()+" "+emp.getSalary());
			
		}
		return list;
	}
	@RequestMapping("/hii")
	public String call() {
		System.out.println("Hello from Test");
		return "index";
	}
	
	
      
}
