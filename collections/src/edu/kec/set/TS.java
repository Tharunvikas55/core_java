package edu.kec.set;

import java.util.TreeSet;

public class TS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> distance =new TreeSet<Integer>();
		
		distance.add(100);
		distance.add(200);
		distance.add(100);
		distance.add(500);
		distance.add(600);
		distance.stream().forEach(System.out::println);
		
		System.out.println(distance.first());
		System.out.println(distance.last());
		System.out.println(distance.ceiling(500));
		System.out.println(distance.floor(300));
	}

}
