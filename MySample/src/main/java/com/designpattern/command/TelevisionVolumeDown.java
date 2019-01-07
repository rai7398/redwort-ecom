package com.designpattern.command;

public class TelevisionVolumeDown implements Command {

	private ElectronicDevice electronicDevice;	

	public TelevisionVolumeDown(ElectronicDevice electronicDevice){
		this.electronicDevice=electronicDevice;
	}

	public void execute(){
		this.electronicDevice.volumeDown();
	}
   }