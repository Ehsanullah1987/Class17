package com.class17;

public class ObjectOfComputerClass {
	public static void main(String[] args) {
		Computer dell=new Computer();
		dell.type="New Product";
		//dell.keyboard="Full Button";
		dell.monitor="LCD";
		dell.mouse="Lieser options";
		dell.name="Duel Core 7";
		dell.brand="Intel";
		dell.ram=520;
		dell.memory=1000;
		dell.screen=15;
		System.out.println(" I need a computer "+dell.brand+ " dell " +dell.screen+ " inches Screen");
	}

}
