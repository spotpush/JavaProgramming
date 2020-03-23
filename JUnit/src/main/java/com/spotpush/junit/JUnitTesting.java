/*
 * JUnit Testing
 * How to set it up and how to test programs
 * 
 */
package com.spotpush.junit;

import java.util.HashSet;

public class JUnitTesting {
	
	public static void main(String[] args) {
			
		HashSet<String> hs = new HashSet<>();
		hs.add("Stepen");
		hs.add("Kate");
		hs.add("Ana");
		hs.add("Elizabeth");
		System.out.println("Hardy Family: "+hs);
	}
}
