package Practical11.src;

import java.util.*;

public class Prac2 {
	public static void main(String[] args) {
		PriorityQueue<String> queue1 = new PriorityQueue<>(Arrays.asList(
			"George", "Jim", "John", "Blake", "Kevin", "Michael"));

		PriorityQueue<String> queue2 = new PriorityQueue<>(Arrays.asList(
			"George", "Katie", "Kevin", "Michelle", "Ryan"));

		System.out.println("Set1:- " + queue1);
		System.out.println("Set2:- " + queue2);
		System.out.println("Union of sets:- " + union(queue1, queue2));
		System.out.println("Difference of sets:- " + difference(queue1, queue2));
		System.out.println("Intersection of sets:- " + intersection(queue1, queue2));
	}

	public static <T> PriorityQueue<T> union(
			PriorityQueue<T> set1, PriorityQueue<T> set2) {
		PriorityQueue<T> union = new PriorityQueue<>(set1);
		union.addAll(set2); 
		return union;
	} 

	public static <T> PriorityQueue<T> difference(
			PriorityQueue<T> set1, PriorityQueue<T> set2) {
		PriorityQueue<T> difference = new PriorityQueue<>(set1);
		difference.removeAll(set2);
		return difference;
	}

	public static <T> PriorityQueue<T> intersection(
			PriorityQueue<T> set1, PriorityQueue<T> set2) {
		PriorityQueue<T> intersection = new PriorityQueue<>(set1);
		intersection.retainAll(set2);
		return intersection;
	}
}