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
import java.util.ArrayList;

 
public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> emails=Arrays.asList("rahul@gmail.com","Mahesh@yahoo.com","vanishree@gmail.com","Nivedita@hotmail.com");
		
		
		Map<String,List<String>> emailList=new HashMap<>();
		
		for(String email:emails) {
			String domain =email.substring(email.indexOf("@")+1, email.indexOf(".")-1);
			
			if(emailList.containsKey(domain)) {
				List <String> em=emailList.get(domain);
				List<String> ems=new ArrayList<>(em);
				ems.add(email);
				emailList.put(domain,ems);
			}
			else {
				emailList.put(domain, Arrays.asList(email));
			}
		}
   emailList.forEach((d,e)->{
	   System.out.println("\n\nDomain : "+d);
	   System.out.println("------------");
	   e.forEach((s)->System.out.println(s));
	});
	}
}


