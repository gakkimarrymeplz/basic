package com.zmh.stream;

import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CountWordLenth {
	public static void main(String[] args) throws IOException {
		String contents = new String(Files.readAllBytes(Paths.get("test")),StandardCharsets.UTF_8);
		List<String> words =Arrays.asList(contents.split("\\PL+"));//Split into words;nonletters are delimiters
		/*
		 * int count=0; for(String w:words) { if(w.length()>12) { count++; } }
		 
	
		
		
		long count=words.stream().filter(w -> w.length() > 12).count();
		
		
		System.out.println(count);
		Stream<String> songs= Stream.of("apple","banana","car","desk");
		int[] arr = new int[2];
		arr[0]=1;
		arr[1]=2;
		Arrays.stream(arr,0,1);*/
		Stream<Double> rand = Stream.generate(Math::random);
		System.out.println(rand);
	}
}
