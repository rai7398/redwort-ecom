package com.designpattern.command;

public class TelevisionSwitchOff implements Command {

	private ElectronicDevice electronicDevice;	

	public TelevisionSwitchOff(ElectronicDevice electronicDevice){
		this.electronicDevice=electronicDevice;
	}

	public void execute(){
		this.electronicDevice.switchOff();
	}
   }