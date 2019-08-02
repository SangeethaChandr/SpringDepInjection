package com.mvcsample.DepInj;

import org.springframework.stereotype.Component;

@Component
public class Logo {

	private String LogoImg;

	public String getLogoImg() {
		return LogoImg;
	}

	public void setLogoImg(String logoImg) {
		LogoImg = logoImg;
	}

	@Override
	public String toString() {
		return "Getting Logo";
	}
	
	
	
}
