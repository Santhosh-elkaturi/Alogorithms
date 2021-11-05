package com.practice.java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ForeachDemo {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("santhosh");
		list.add("kumar");
		list.add("sridher");
		list.add("skm");
		list.add("manish");
		
		/*
		 * for (String s : list) { if(s.startsWith("s")) System.out.println(s); }
		 */
		
		Consumer<String> consumer =t->System.out.println("printing value "+ t);
		for (String s2 : list) {
			consumer.accept(s2);
		}
		
		Predicate<String> predicate = s-> s.startsWith("s");
		
		System.out.println("Using java 8 ");
		list.stream().filter(predicate).forEach(s->System.out.println(s));
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		map.put(4, "d");
		map.forEach((k,v) -> System.out.println("key "+k+"  value "+v));
		map.entrySet().stream().forEach(obj-> System.out.println(obj.getKey()+"-- "+obj.getValue()));
	}
}
