package com.example.demo.bean;

public class LimitConfiguration {

	private int maximium;
	private int minimum;

	public LimitConfiguration() {
	}

	public LimitConfiguration(int maximium, int minimum) {
		this.maximium = maximium;
		this.minimum = minimum;
	}

	public int getMaximium() {
		return maximium;
	}

	public void setMaximium(int maximium) {
		this.maximium = maximium;
	}

	public int getMinimum() {
		return minimum;
	}

	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}

	
}
