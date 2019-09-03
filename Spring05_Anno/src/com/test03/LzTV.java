package com.test03;

import org.springframework.stereotype.Component;

@Component
public class LzTV implements TV {
	
	
	public LzTV() {
		System.out.println("Lz TV 생성!");
	}

	@Override
	public void powerOn() {
		System.out.println("Lz TV power On!");
	}

	@Override
	public void powerOff() {
		System.out.println("Lz TV power Off!");
	}

	@Override
	public void volumeUp() {
		System.out.println("Lz TV volume Up!");
	}

	@Override
	public void volumeDown() {
		System.out.println("Lz TV volume Down!");
	}

}
