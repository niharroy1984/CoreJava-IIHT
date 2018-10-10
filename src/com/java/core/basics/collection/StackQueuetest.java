package com.java.core.basics.collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueuetest {

	// Iterable<----Collection<----List,Set
	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<>();
		
		stack.push("hello");
		stack.push("iiht");
		stack.push("team");
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack);
		
		Queue<String> queue = new LinkedList<>();
		
		queue.add("hello");
		queue.add("cognizant");
		queue.add("team");
		System.out.println(queue);
		System.out.println(queue.peek());
		System.out.println(queue.peek());
	}
}
