package com.java.LambdaFeature;

import java.util.function.Function;
import java.util.stream.Stream;

public class MainDemo {
	public static void main(String args[]) {
		Message m1=(name)->{
			System.out.println("Hello world");
		};
		
		
		Cube c=(a)->{
			return(a*a*a);
		};
		System.out.println(c.calculate(2));
		
		
		Stream<Integer>stream=Stream.of(10,20,30,40,50,60);
		Function<Integer,Integer> sqr=(n)->n*n;
		stream.map(sqr).forEach(System.out::println);
		
		
	}
}
