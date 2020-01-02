package com.Deloitte;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;


public class FileOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Files.lines(Paths.get("hello.txt"))
		.filter(s->(s.toString().split("")).length>=3)
		.map(String::toUpperCase)
		.forEach(System.out::println);
			
		
		} catch (Exception ex) {
			System.out.println(ex);
	    	}                                                                                                              
	 }
}
