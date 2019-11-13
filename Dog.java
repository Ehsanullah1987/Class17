package com.class17;

public class Dog {
 String type,name, color, size ;  //usky, Bulldog, Labrador 
 int age, legs, aers;
void Ears() {
	System.out.println(name+" can hear sound with his ear");
}
void Eyes() {
	System.out.println(name+" can see around of himself with his eyes");
}
void Sense() {
	System.out.println(name+" can discover important things then me with his sense");
}
public static void main(String[] args) {
 Dog dog1=new Dog();
  dog1.type="Husky";
  dog1.name="Bush";
  dog1.color="red";
  dog1.size="Large";
  System.out.println(" I have a bad ass "+dog1.type+" dog his name is "+dog1.name);
  
  dog1.Ears();
  dog1.Eyes();
  dog1.Sense();
}
}
