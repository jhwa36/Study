package com.test07;

public class SamsongTV implements TV {
	
	public SamsongTV() {
		System.out.println("Samsong Tv 생성!");
	}
	@Override
	public void powerOn() {
		System.out.println("Samsong Tv power on");
	}

	@Override
	public void powerOff() {
		System.out.println("Samsong Tv power off");

	}

	@Override
	public void volumeUp() {
		System.out.println("Samsong Tv volume up");
	}

	@Override
	public void volumeDown() {
		System.out.println("Samsong Tv volume down");
	}

}
