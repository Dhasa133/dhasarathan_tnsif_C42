package com.tnsif.day3;

public class InheritanceDemo {
	
public static void main(String []args) {
		
		Puppy puppy=new Puppy();
		puppy.bark();
		puppy.sleep();
		
		
		car c=new car();
		c.drive();
		c.start();
		
		
		bike b=new bike();
		b.ride();
		b.drive();
		b.start();
		
		Rose r=new Rose();
		r.bloom();
		r.blooming();
		
		Tulip t=new Tulip();
		t.bloom();
		t.bud();
		
		
		
}
}
		
	class Dog
	{
		void bark()
		{
			System.out.println("the dog is barking");
		}
	}
	//class puppy
	class Puppy extends Dog
	{
		void sleep()
		{
			System.out.println("THe puppy is sleeping");
		}
	
	
	
}
	//multilevel inheritance
	//parent class
	class Vehicle{
		
		void start() {
			System.out.println("The vehivle is started");
		}
	}
	
class car extends Vehicle{
		
		void drive() {
			System.out.println("The car is driven is driver");
		}
	}
	
class bike extends car{
	
	void ride() {
		System.out.println("The bike is ride bt rider");
	}
}


//hierarchical Inheritance
//parent class

class Flower{
	
	void bloom() {
		System.out.println("The flower is about bloom");
	}
}

class  Rose extends Flower{
	
	void blooming() {
		System.out.println("The flower is  blooming");
	}
}

class Tulip extends Flower{

void bud() {
	System.out.println("the tulip is in bud stage");
}
}


	
	
	
	
	
	
	
	
	
	
	
	

