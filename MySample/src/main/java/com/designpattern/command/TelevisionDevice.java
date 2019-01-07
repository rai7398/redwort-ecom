package com.designpattern.command;

public class TelevisionDevice {
	
	private Command command;	
	
	public TelevisionDevice(Command command){
		this.command=command;
	}

	public void press(){
		this.command.execute();
	}
  }