package com.class17;

public class Phone {
	String iPhone, Android, Nokia, brand, model;
	int screen, year;
	
	
void Coding() {
	System.out.println(brand+ " coding is phone coding");
}
void Talking() {
	System.out.println("with the "+model+ " iphone, I can download free apps");
	
}
void Calling() {
	System.out.println(year+" Calling app I can call with this app");
}
public static void main(String[] args) {
Phone phone1=new Phone();
phone1.brand="iphone 10";
phone1.screen=6;
phone1.model="SmartPhone";
phone1.year=2019;

phone1.Talking();
phone1.Calling();
phone1.Coding();

Phone phone2=new Phone();
phone2.brand="Nokia";
phone2.model="Good Looking";
phone2.screen=4;
phone2.year=2010;

phone2.Talking();
phone2.Calling();
phone2.Coding();

Phone phone3=new Phone();
phone3.brand="Android";
phone3.model="8X";
phone3.screen=5;
phone3.year=2002;

phone3.Talking();
phone3.Calling();
phone3.Coding();




}
}
