package com.deloitte;

import java.util.Arrays;
import java.util.function.Predicate;                                        
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.HashMap;

public class MapsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Character,Integer> charOcc=new HashMap<>();
		
		String str ="Rakshit Shetty";
		
		for (char c:str.toCharArray()) {
			if(charOcc.containsKey(c)) {
				int oc=charOcc.get(c)+1;
				charOcc.put(c, oc);
			}
			else {
				charOcc.put(c,1);
			}
		}
		charOcc.forEach((c,oc)-> System.out.println(c+"->"+oc));
	}
 }


