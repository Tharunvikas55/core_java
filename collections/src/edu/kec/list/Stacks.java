package edu.kec.list;

import java.util.Stack;

public class Stacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> history =new Stack<String>();
		
		try {
			history.push("Tharun");
			history.push("Vikas");
			history.push("SS");
			System.out.println(history.size());
			System.out.println(history.peek());
			System.out.println(history.size());
			
			System.out.println(history.pop());
			System.out.println(history.size());
			
			System.out.println(history.peek());
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

}
