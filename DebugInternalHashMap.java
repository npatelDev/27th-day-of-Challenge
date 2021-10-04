package com.HashMap.Main;

import java.util.HashMap;

public class DebugInternalHashMap {
	public static void main(String[] args) {
		
		HashMap<String,Integer> it=new HashMap<String,Integer>();
		
		it.put("nav", 100);
		it.put("Sharma", 200);
		it.put("Ravi", 300);
		it.put("Mohit", 400);
		it.put("Maya", 500);
		it.put(null, 600);
		//Checking HashCode()----Hashcode
		
		System.out.println(it.get("Maya"));
		
		//hashcode of maya---210978
		//calulate index id=15
		//Maya
		//return value
	}
}
