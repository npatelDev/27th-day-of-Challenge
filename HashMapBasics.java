package com.HashMap.Main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapBasics {
		public static void main(String[] args) {
			
			HashMap<String,String> HashList=new HashMap<String,String>();
			
			HashList.put("India", "NewDelhi");
			HashList.put("USA", "WashingTon Dc");
			HashList.put("UK", "London");
			
			//we can have maximum one null key .
			//if more than one key -first one overrides second key value
			//that is why we have maximum one key value
			
			HashList.put(null, "Berline");
			
			//we have n number of null values in hashMap condition 
			//IS maximum one null key
			HashList.put("Russia", null);
			HashList.put("France", null);
			HashList.remove("Russia");
			//As its not stored in order like arrayList we can use for,while etc loop
			//to traverse the one by one values we use iterator
			//iterate over the key :by using keySet()
			Iterator<String> itera=HashList.keySet().iterator();
			//on hashMap we can apply directly iterator because we dont't have methods
			
			while(itera.hasNext()) {
				String key=itera.next();
				String Value=HashList.get(key);
				System.out.println("Key ="+" "+key+"Value ="+" "+Value);
			}
			System.out.println("----------------------");
			//iterate over the set pair :by using entrySet
			Iterator<Entry<String,String>> it=HashList.entrySet().iterator();
			while(it.hasNext()) {
				Entry<String,String> entry=it.next();
				System.out.println("Key ="+" "+entry.getKey()+"Value ="+" "+entry.getValue());
			}
			System.out.println("----------------------");
			//iterate HashMap by using java 8 forEach and lambda:
			HashList.forEach((k,v) ->System.out.println("Key ="+" "+k+"Value ="+v+" "));
			
		}
}
