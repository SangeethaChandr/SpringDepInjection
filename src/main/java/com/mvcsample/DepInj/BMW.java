package com.mvcsample.DepInj;

import org.springframework.beans.factory.annotation.Autowired;

public class BMW implements Vehicle{
	
	@Autowired
		private Logo logo;
		public void drive() {
			System.out.println("Car Type: Chosen BMW");
			System.out.println("Get Logo:"+logo);
		}
	
}
