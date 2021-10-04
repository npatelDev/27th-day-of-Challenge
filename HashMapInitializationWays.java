package com.HashMap.Main;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashMapInitializationWays {
	
	public static Map<String,String> marksmap;
	static {
		//if we will not initialize the map we will get NullPointerException
		marksmap =new HashMap<>();
		marksmap.put("Hari", "Pickup calls");
		
	} //generally we are not using static map because it will create inner anaymonus class 
	//which leads to stack overflow
	
	public static void main(String[] args) {
		//1). Using HashMap Class
		HashMap<String,String> map1=new HashMap<>();
		
		map1.put("Nitesh1", "Will Attend Class");
		map1.put("Nitesh2", "Will Attend Internal Meetings");
		map1.put("Nitesh3", "Will Attend Cliets Today");
		
		System.out.println(map1.get("Nitesh3"));
		//write with topCasting 
		Map<String,String> map2=new HashMap<>();
		map2.put("Umesh", "Will Manage Work Flow");
		map2.put("Suresh", "Will List out Design Process");
		map2.put("Mamta", "Will manage finance for upcoming Project");
		
		System.out.println(map2.get("Mamta"));
		
		
		//2).Static way:Static HashMap
		 //for static we need to initilze map 
		System.out.println(HashMapInitializationWays.marksmap.get("Hari"));
		
	
		//3).immutable map with one single entry by using :singleton
		Map<String,String> immu1=Collections.singletonMap("raj","bcom");
		System.out.println(immu1.get("raj"));
		
		//we can not change immutable object by add or remove operation
		//if we try to do that it will throw an exception called :UnsupportedOperationException
		//immu1.put("HUM", "TUM");
		//System.out.println(immu1.get("HUM"));
		
		//4).jdk 8
		//ToMap Method
		Map<String,String> map4=Stream.of(new String[][]{
		{"Tom","A Grade"},
		{"Nitesh","A++ Grade"},
	}).collect(Collectors.toMap(data -> data[0],data -> data[1]));
		System.out.println(map4.get("Tom"));
		map4.put("Rahul", "29");
		System.out.println(map4.get("Rahul"));
		//we put multiple key and values
		
		//Using SimpleEntry :mutable  map using simpleEntry
		Map<String,String> map5=Stream.of(
				new AbstractMap.SimpleEntry<>("Hari Om", "Pardeshi Lal"),
				new AbstractMap.SimpleEntry<>("Hari", "Parde")).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
		System.out.println(map5.get("Hari"));
		map5.put("Ramesh","Baware");
		System.out.println(map5.get("Ramesh"));
		
		
	}
	
	
}
