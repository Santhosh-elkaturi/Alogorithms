package com.practice.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class SortMapDemo {

	public static void main(String[] args) {
		Map<String,Integer> map =  new HashMap<String, Integer>();
		map.put("eight", 8);
		map.put("four", 4);
		map.put("ten", 10);
		map.put("two", 2);
		
		// converting into List and sort using java 7
		ArrayList<Entry<String,Integer>> arrayList = new ArrayList<>(map.entrySet());
		Collections.sort(arrayList,new Comparator<Entry<String,Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				//return o1.getKey().compareTo(o2.getKey());
				return o1.getKey().compareTo(o2.getKey());
			}
			
		});
		System.out.println("using java 7");
		for (Entry<String, Integer> entry : arrayList) {
			System.out.println(entry.getKey()+" : : "+entry.getValue());
		}
		//using java 8
		
		Collections.sort(arrayList,(o1,o2)->o1.getValue().compareTo(o2.getValue()));
		System.out.println("using java 8");
		for (Entry<String, Integer> entry : arrayList) {
			System.out.println(entry.getKey()+" : : "+entry.getValue());
		}
		
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		
		int n= 280;
		String s = Integer.toString(n);
		char charAt = s.charAt(0);
	
		s.length()
		char[] charArray = s.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			
			
			
			
		}

		
	}
}
