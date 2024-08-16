package edu.kec.set;

import java.util.HashSet;
import java.util.Set;

public class HS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> studentIdList = new HashSet<Integer>();
		studentIdList.add(7897);
		studentIdList.add(7863);
		studentIdList.add(7899);
		studentIdList.add(7897);
		
		
		
		
		studentIdList.stream().forEach(System.out::println);
		studentIdList.size();
		studentIdList.contains(7897);
	}

}
