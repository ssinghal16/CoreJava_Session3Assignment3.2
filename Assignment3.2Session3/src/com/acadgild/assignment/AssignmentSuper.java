/*
 * Write a program in Java to show the use of Super keyword with a constructor, methods,variables
 */

package com.acadgild.assignment; //package declaration

class Animal{  
	//Super with Variables 
	String color="white"; 
	//Super with Constructor
	Animal(){
		System.out.println("animal is created");
	}  
	//Super with Method 
	void eat(){
		System.out.println("eating...");
	}  
}  

class Dog extends Animal{  
	//Super with Variables 
	String color="black";  
	void printColor(){  
		System.out.println(color);//prints color of Dog class  
		System.out.println(super.color);//prints color of Animal class  
	}  
	//Super with Constructor 
	Dog(){  
		super();  
		System.out.println("dog is created");  
		}
	//Super with Method 
	void eat(){
		System.out.println("eating bread...");
	}  
	void bark(){
		System.out.println("barking...");
	}  
	void work(){  
		super.eat();  
		bark();  
	} 
}  
public class AssignmentSuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d=new Dog();  
		d.printColor();
		d.work();
	}

}
