package com.tnsif.day4;

class Number{
	int num1;
	int num2;
	int result;
	
	
	void sum (int a,int b)
	{
		num1=a;
		num2=b;
		result=a+b;
		System.out.println("The result is: "+result);
	}
	
	void sum(int a,double b) {
		num1=a;
		num2=(int)b;
		result=a+(int)b;
		System.out.println("THe Result is: "+result);
		
	}
	
	void sum(double a,double b)
	{
		num1=(int)a;
		num2=(int)b;
		result=(int)a+(int)b;
		System.out.println("The Result is:" +result);
	}
}


public class Overload {

	public static void main(String[] args) {
		// TODO Auto-generated method 

		Number n=new Number();
		n.sum(10,20);
		n.sum(20,40.5);
		n.sum(50,80.6);
		

	}

}
