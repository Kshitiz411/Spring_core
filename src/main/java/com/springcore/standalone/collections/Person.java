package com.springcore.standalone.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
	private List<String> hobbies;
	private Map<String, Integer> feestructure;
	private Properties properties;
	
	public List<String> getHobbies() {
		return hobbies;
	}
	public void setHobbies(List<String> hobbeis) {
		this.hobbies = hobbeis;
	}
	public Map<String, Integer> getFeestructure() {
		return feestructure;
	}
	public void setFeestructure(Map<String, Integer> feestructure) {
		this.feestructure = feestructure;
	}
	public Properties getProperties() {
		return properties;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	@Override
	public String toString() {
		return "Person [hobbies=" + hobbies + ", feestructure=" + feestructure + ", properties=" + properties + "]";
	}
	
	

	

}
