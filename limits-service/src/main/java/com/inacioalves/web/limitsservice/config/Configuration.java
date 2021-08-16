package com.inacioalves.web.limitsservice.config;

import org.springframework.stereotype.Component;

@Component
@org.springframework.boot.context.properties.ConfigurationProperties("limits-service")
public class  Configuration {
	
	private int minimum;
	private int maximum;
	
	public int getMinimum() {
		return minimum;
	}
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}
	public int getMaximum() {
		return maximum;
	}
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}
	
	
	
	
	

}
