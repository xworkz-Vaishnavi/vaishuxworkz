package com.xworkz.xworkzapp.util;

import com.xworkz.xworkzapp.speaker.*;
public class SpeakerUtil {

	public static void main(String[] args) {
		
		Speaker speaker =new Speaker(2000.00, 9);
		System.out.println(speaker.getBatteryBackupForHours());
		System.out.println(speaker.isConnected());
		System.out.println(Speaker.getBrandName());
		System.out.println(speaker.getColor());
		
		speaker.increaseVolume();
		speaker.onOrOff();
		speaker.increaseVolume();
		speaker.increaseVolume();
		speaker.increaseVolume();
		speaker.increaseVolume();
		speaker.increaseVolume();
		speaker.increaseVolume();
		speaker.increaseVolume();
		speaker.increaseVolume();
		speaker.decreaseVolume();
		speaker.increaseVolume();
		speaker.decreaseVolume();
		speaker.decreaseVolume();
		speaker.decreaseVolume();
		speaker.decreaseVolume();
		
	}
}
