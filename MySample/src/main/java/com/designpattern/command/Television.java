package com.designpattern.command;

public class Television implements  ElectronicDevice {

	private int volumeLevel = 0;

	@Override
	public void switchOn() {
		System.out.println("TV is on");
	}

	@Override
	public void switchOff() {
		System.out.println("TV is off");
	}

	@Override
	public void volumeUp() {
		volumeLevel++;
		System.out.println("Volume Level is: " + volumeLevel);
	}

	@Override
	public void volumeDown() {
		volumeLevel++;
		System.out.println("Volume Level is: " + volumeLevel);
	}

}
