package com.tnsif.day3;

 class Student {
	String name;
	int rollNo;
	static String teachername;
	
	void display() {
		
		
		System.out.println("Student name: "+name);
		System.out.println("Student rollnumer: "+rollNo);
		System.out.println("Student teachername: "+teachername);
		
		
	}
	static {
		Student.teachername="Malar";
	}
	
	}
public class StaticDemo{
	static void method()
	{
		System.out.println("Static keyword in this method");
	}
	public static void main(String args[]) {
        Student s1=new Student();
		Student s2=new Student();
		
		s1.name="George";
		s2.rollNo=1001;
		
		s2.name="Arivu";
		s2.rollNo=1002;
		
		s1.display();
		s2.display();
		
		method();
		
		
		
	}
}


