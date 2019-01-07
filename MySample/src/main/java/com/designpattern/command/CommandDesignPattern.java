package com.designpattern.command;

public class CommandDesignPattern {

	public static void main(String a[]){
		
		ElectronicDevice electronicDevice= new Television();
		
		/* Switch On the television */
		Command commandSwitchOn=new TelevisionSwitchOn(electronicDevice);
		TelevisionDevice televisionDeviceSwitchOn=new TelevisionDevice(commandSwitchOn);
		televisionDeviceSwitchOn.press();

		/* Increase the volume */
		Command commandVolumeUp=new TelevisionVolumeUp(electronicDevice);
		TelevisionDevice televisionDeviceVolumeUp=new TelevisionDevice(commandVolumeUp);
		televisionDeviceVolumeUp.press();

		/* Decrease the volume */
		Command commandVolumeDown=new TelevisionVolumeDown(electronicDevice);
		TelevisionDevice televisionDeviceVolumeDown=new TelevisionDevice(commandVolumeDown);
		televisionDeviceVolumeDown.press();
	
		/* Switch Off the television */
		Command commandSwitchOff=new TelevisionSwitchOff(electronicDevice);
		TelevisionDevice televisionDeviceSwitchOff=new TelevisionDevice(commandSwitchOff);
		televisionDeviceSwitchOff.press();
	}
   }