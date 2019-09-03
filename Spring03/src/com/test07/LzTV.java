package com.test07;

public class LzTV implements TV {
	
	public LzTV() {
		System.out.println("Lz Tv 생성!");
	}
	
	@Override
	public void powerOn() {
		System.out.println("Lz Tv power on");
	}

	@Override
	public void powerOff() {
		System.out.println("Lz Tv power on");
	}

	@Override
	public void volumeUp() {
		System.out.println("Lz Tv volume up");

	}

	@Override
	public void volumeDown() {
		System.out.println("Lz Tv volume down");

	}

}
