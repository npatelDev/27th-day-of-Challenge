package com.HashMap.Main;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


public class HashMapSynconizedMethod {
	public static void main(String[] args) {
		
		Map<String,String> syncro=new HashMap<String,String>();
		syncro.put("hari", "29");
		syncro.put("hari om", "26");
		syncro.put("hari jai", "27");
		//Create SynchronizeMap
		Map<String,String> synclist=Collections.synchronizedMap(syncro);
		System.out.println(synclist.get("hari"));
		
		//Create Concurrent class in java
		//it doesNot  throw any ConcurrentModificationException
		
		ConcurrentHashMap<String,String> concurrent=new ConcurrentHashMap<>();
		concurrent.put("Ram", "Pass");
		concurrent.put("amman", "A++");
		concurrent.put("amar", "Fail");
		concurrent.put("umesh", "Fail");
		concurrent.put("Shyam", "A");
		
		System.out.println(concurrent.get("Shyam"));
	}
}
