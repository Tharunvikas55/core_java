package edu.kec.list;

import java.util.LinkedList;

public class LL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> names = new LinkedList<String>();
		names.add("ABC");
		names.add("DEF");
		names.add("IJK");

		names.addFirst("first");
		names.addLast("last");

		System.out.println(names);

		for (String name : names) {
			System.out.println(name);
		}

		System.out.println(names.contains("ABC"));

		System.out.println(names.get(3));

		System.out.println(names.getFirst());

		System.out.println(names.getLast());

		names.remove();
		
		//Linked list doesnot sort strings
		//names.sort();

		Object[] namesArray = names.toArray();

		LinkedList<String> newOrder = names.reversed();
	}

}
