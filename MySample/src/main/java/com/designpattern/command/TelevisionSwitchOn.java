package com.designpattern.command;

public class TelevisionSwitchOn implements Command {

	private ElectronicDevice electronicDevice;	

	public TelevisionSwitchOn(ElectronicDevice electronicDevice){
		this.electronicDevice=electronicDevice;
	}

	public void execute(){
		this.electronicDevice.switchOn();
	}
   }
