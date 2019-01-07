package com.designpattern.command;

public class TelevisionVolumeUp implements Command {

	private ElectronicDevice electronicDevice;	

	public TelevisionVolumeUp(ElectronicDevice electronicDevice){
		this.electronicDevice=electronicDevice;
	}

	public void execute(){
		this.electronicDevice.volumeUp();
	}
    }