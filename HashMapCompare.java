package com.HashMap.Main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class HashMapCompare {
	public static void main(String[] args) {
		
		HashMap<Integer,String> map1=new HashMap<Integer,String>();
		map1.put(1, "A");
		map1.put(2, "B");
		map1.put(3, "C");
		
		
		HashMap<Integer,String> map2=new HashMap<Integer,String>();
		
		map2.put(3, "C");
		map2.put(1, "A");
		map2.put(2, "B");
		
		
		
		HashMap<Integer,String> map3=new HashMap<Integer,String>();
		
		map3.put(3, "D");
		map3.put(2, "E");
		map3.put(1, "C");
		map3.put(3, "A");
HashMap<Integer,String> map4=new HashMap<Integer,String>();
		
		map4.put(1, "D");
		map4.put(2, "E");
		map4.put(3, "C");
		map4.put(4, "A");
		
		
		//1) on the basis of key value: equals method
		System.out.println(map1.equals(map2));
		System.out.println(map1.equals(map3));
		System.out.println(map2.equals(map3));
		
		//2)compare hashMap for key:keySet()
		System.out.println((map1.keySet()).equals(map2.keySet()));
		System.out.println((map1.keySet()).equals(map3.keySet()));
		
		//combine key from both maps :by using hashSet
		HashSet<Integer> CombineKey=new HashSet<Integer>(map1.keySet());
		CombineKey.addAll(map4.keySet());
		CombineKey.removeAll(map1.keySet());
		System.out.println(CombineKey);
		
HashMap<Integer,String> map5=new HashMap<Integer,String>();
		
		map5.put(1, "D");
		map5.put(2, "E");
		map5.put(3, "C");
	
		
HashMap<Integer,String> map6=new HashMap<Integer,String>();
		
		map6.put(4, "D");
		map6.put(5, "E");
		map6.put(6, "C");
	
		
HashMap<Integer,String> map7=new HashMap<Integer,String>();
		
		map7.put(1, "D");
		map7.put(2, "E");
		map7.put(3, "C");
		map7.put(4, "C");
		//3) Duplicates values are not allowed by using:ArrayList
		System.out.println((new ArrayList<>(map5.values())).equals(new ArrayList<>(map6.values())));
		System.out.println((new ArrayList<>(map5.values())).equals(new ArrayList<>(map7.values())));
		System.out.println("-----------------------");
		//4) Duplicates values are allowed by using:HashSet
		
		System.out.println((new HashSet<>(map5.values())).equals(new HashSet<> (map6.values())));
		System.out.println((new HashSet<>(map5.values())).equals(new HashSet<> (map7.values())));
				
				
	}
}
