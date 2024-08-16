package edu.kec.list;

import java.util.Iterator;
import java.util.Vector;

public class V {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> heightList=new Vector<Integer>();
		
		heightList.add(10);
		heightList.add(20);
		
		Iterator<Integer> iterator=heightList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		heightList.set(1,60);
		System.out.println(heightList.get(1));
		heightList.sort(null);
		heightList.clear();

	}

}
