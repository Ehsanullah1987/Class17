package com.class17;

public class ObjectOfCarClass {
	public static void main(String[] args) {
		// To create an object syntax is
		//className variable= new ClassName();
		//Scanner scan=new Scanner(System.in); Scanner is class.
		//String str=new String(); String is class.
		Car car1=new Car();
		car1.make="Tesla";
		car1.model="S3";
		car1.color="Black";
		car1.year=2020;
		car1.wheels=4;
		car1.windows=5;
		car1.speed=200;
		// Accessing behavior for 1 object
		car1.drive();// calling method start from class car1.
		car1.start();
		car1.accelerate();
		car1.stop();
		//
		Car car2=new Car();
		car2.make="BMW";
		car2.model="i8";
		car2.color="Purple";
		car2.year=2019;
		car2.wheels=4;
		car2.windows=6;
		car2.speed=300;
		// Accessing behavior for 2 object.
		car2.drive(); // calling method start from class car2.
		car2.start();
		car2.accelerate();
		car2.stop();
		System.out.println("=================");
		// print features of the car
		// I have black Tesla.
		System.out.println("I have " +car1.color+" "+car1.make);
		System.out.println("I drive "+car2.make+" "+car2.color+" and year is "+car2.year);
		
	}

}
