package edu.kec.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AL {
	public static void main(String[] args) {
		List<Integer> marksList = new ArrayList<Integer>();
		// List<String> nameList = new ArrayList<String>();
		// To add single values to the arrayList
		marksList.add(81);
		marksList.add(55);
		marksList.add(56);
		marksList.add(57);
		// nameList.add("Tharun");

		// Iterate throungh ArrayList

		// first method accessing elements using index
		for (int i = 0; i < marksList.size(); i++) {
			System.out.println(marksList.get(i));
		}

		// accessing elements using foreach
		for (Integer mark : marksList) {
			System.out.println(mark);
		}

		// accessing elements using Iterator
		Iterator<Integer> iterator = marksList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		// accessing elements using stream()
		marksList.stream().forEach(mark -> System.out.println(mark));
		
		//marksList.stream().filter(mark->mark>85).toList();
		
		// search an elements in collection
		System.out.println(marksList.contains(55));
		
		marksList.remove(0);

	}

}
