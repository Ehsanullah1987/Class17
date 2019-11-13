package com.class17;

public class Computer {
// define features, and attributes
	String type, monitor, mouse, name, brand;
	boolean keyboard;
	int ram, memory, screen;
	// define behavior, actions
	
	void playGames() {// method header
		// method body
		System.out.println("I can play game on my HP "+name);
	}
	void javaCoding() {
		System.out.println("I can do java coding on my "+name);
	}
	void watchMovie() {
		System.out.println("I can watch movies on my "+name);
	}
	//////////////////////////////////////////////////////
	public static void main(String[] args) {
		Computer comp1=new Computer();
		comp1.brand="Apple";
		comp1.name="MacBook Pro";
		comp1.memory=250;
		System.out.println("I have "+comp1.brand+" "+comp1.name);
		comp1.javaCoding();
		comp1.watchMovie();
		
		Computer computer2=new Computer();// we are making an object.
		computer2.brand="HP";
		computer2.name="440";
		computer2.memory=125;
		
		computer2.javaCoding();
		computer2.watchMovie();
		computer2.playGames();
	}
}
