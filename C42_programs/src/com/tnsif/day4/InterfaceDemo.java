package com.tnsif.day4;

interface stud1
{
	int age=25;//final and static
	public abstract void display();
}

class stud2 implements  stud1
{
	public void display()
	
	{
		System.out.println("The stud1 is an interface");
		System.out.println(age);
	}
}


public class InterfaceDemo {

	public static void main(String[] args) {
		stud1 st=new stud2();
		st.display();
		
		

	}

}
