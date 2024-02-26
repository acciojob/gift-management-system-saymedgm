package com.driver;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	  private String name;
	    private List<Gift> gifts;

	    public Employee(String name) {
	       // your code goes here
	    }

	    public void receiveGift(Gift gift) {
	    	// your code goes here
	    }

	    public String getName() {
	    	// your code goes here
	        return name;
	    }
	    
	    public List<Gift> getGifts() {
	    	// your code goes here
	        return gifts;
	    }
}
