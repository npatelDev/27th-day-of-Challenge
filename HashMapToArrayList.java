package com.HashMap.Main;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapToArrayList {
		public static void main(String[] args) {
			
			Map<String ,Integer> companyList=new HashMap<>();
			
			companyList.put("Amazon", 20000);
			companyList.put("FlipKart", 15000);
			companyList.put("WalMART", 10000);
			companyList.put("Facebook", 30000);
			companyList.put("Google", 40000);
			
			System.out.println("Company Size "+" "+companyList.size());
			Iterator<Entry<String, Integer>> it=companyList.entrySet().iterator();
			while(it.hasNext()) {
				Map.Entry<String,Integer> pairs= (Map.Entry<String,Integer>)it.next();
				System.out.println(pairs.getKey()+"="+pairs.getValue());
			}
			System.out.println("List OF  Keys");
			List<String> KeyList=new ArrayList<>(companyList.keySet());
			for(String i: KeyList) {
				System.out.println("Key Array List  +"+i);
			}
			System.out.println("List OF Values OF Key");
			List<Integer> KeyList2=new ArrayList<>(companyList.values());
			for(int j: KeyList2) {
				System.out.println("Value of Key  Array List  "+j);
			}
		}
}
