package com.in28minutes.microservices.limitservices.bean;

public class LimitConfiguration {
	int maximum;
	int minimum;
	
	
	protected LimitConfiguration() {
		
	}
	public LimitConfiguration(int maximum, int minimum) {
		super();
		this.maximum = maximum;
		this.minimum = minimum;
	}
	public int getMaximum() {
		return maximum;
	}
	public int getMinimum() {
		return minimum;
	}
	
	
}
