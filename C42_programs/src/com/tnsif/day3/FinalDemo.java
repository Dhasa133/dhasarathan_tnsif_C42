package com.tnsif.day3;

 class Manager{
	
	void show() {
		System.out.println("Show method in parant class");
	}

}

	class Employee extends Manager{
		void show() {
			System.out.println("Show method in child class");
			
		}
	}
	public class FinalDemo{
		public static void main(String []args) {
			Employee emp=new Employee();
			emp.show();
		}
	}