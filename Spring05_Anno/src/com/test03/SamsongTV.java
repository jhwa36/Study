package com.test03;

import org.springframework.stereotype.Component;

@Component("samsong")
public class SamsongTV implements TV {
	
	
	public SamsongTV() {
		System.out.println("Samsong TV 생성!");
	}

	@Override
	public void powerOn() {
		System.out.println("Samsong TV power On!");
	}

	@Override
	public void powerOff() {
		System.out.println("Samsong TV power Off!");
	}

	@Override
	public void volumeUp() {
		System.out.println("Samsong TV volume Up!");
	}

	@Override
	public void volumeDown() {
		System.out.println("Samsong TV volume Down!");
	}
}
