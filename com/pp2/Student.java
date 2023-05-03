package com.pp2;

public class Student extends Person{
private String nameOfUniversity;
	
	public Student(int age, String name, String nameOfUniversity) {
		super(age,name); //Superconstructor de la clase Person
		this.nameOfUniversity = nameOfUniversity;
	}
	
	public void showStudent() {
		System.out.println("STUDENT´S NAME: " + name);
		System.out.println("AGE: " + age);
		System.out.println("UNIVERSITY: " + nameOfUniversity);
	}
	
	public void showAge(){
		super.showAge(); //invoca el metodo de la clase padre
	}

}
