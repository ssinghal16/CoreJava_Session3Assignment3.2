/*
 * Write a program in Java to show the use of this keyword with a constructor, methods,variables
 */

package com.acadgild.assignment; //package declaration

class AssignmentThis{
	int variable = 5;
	 
//this keyword with a Variable 
	void method(int variable) {
		variable = 10;
		System.out.println("Value of Instance variable :" + this.variable);
		System.out.println("Value of Local variable :" + variable);
	}
 
	void method() {
		int variable = 40;
		System.out.println("Value of Instance variable :" + this.variable);
		System.out.println("Value of Local variable :" + variable);
	}
	
//this keyword with a Constructor 	

	AssignmentThis() {
		this("JBT");
		System.out.println("Inside Constructor without parameter");
	}
 
	AssignmentThis(String str) {
		System.out
				.println("Inside Constructor with String parameter as " + str);
	}
 
//this keyword with a Method
	void methodOne(){
		System.out.println("Inside Method ONE");
		}
 
	void methodTwo(){
		System.out.println("Inside Method TWO");
		this.methodOne();// same as calling methodOne()
	}
	
	public static void main(String args[]) {
		AssignmentThis obj = new AssignmentThis();
 
		obj.method(20);
		obj.method();
		obj.methodTwo();
	}
}


