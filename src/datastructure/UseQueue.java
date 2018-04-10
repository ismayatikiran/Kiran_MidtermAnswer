package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 */
		Queue<String> states = new LinkedList<>();
		states.add("New York");
		states.add("New Jersy");
		states.add("New Hampshire");
		states.add("Main");
		System.out.println("peek : "+states.peek());
		System.out.println("remove : "+states.remove());
		System.out.println("poll : "+states.poll());
		for(String x : states ){
			System.out.println("for loop : "+x);
		}
		Iterator it = states.iterator();
		while(it.hasNext()){
			System.out.println("Iterator : "+it.next());
		}
	}
}