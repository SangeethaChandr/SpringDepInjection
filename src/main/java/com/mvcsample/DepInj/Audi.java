package com.mvcsample.DepInj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class Audi implements Vehicle{
	
	@Autowired
	private Logo logo;
	public void drive() {
		System.out.println("Car Type: Chosen Audi");
		System.out.println("Get Logo:"+logo);
	}

}
