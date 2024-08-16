package edu.kec.set;

import java.util.LinkedHashSet;

public class LHS {

	public static void main(String[] args) {
		LinkedHashSet<Integer> employeeIdList=new LinkedHashSet<Integer>();
		employeeIdList.add(9801);
		employeeIdList.add(9805);
		employeeIdList.add(9802);
		employeeIdList.add(9805);
		
		employeeIdList.stream().forEach(System.out::println);
	}

}
