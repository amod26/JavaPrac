package practice;
import java.util.*;

public class Linkedlist {

	public static void main(String[] args) {		
		LinkedList <String> ll = new LinkedList<String>();
		
		ll.add("Chintanbhai");
		ll.add("DarshanBhai");
		ll.add("Ambrishbhai");
		ll.add("Ashishbhai");
		ll.add("Amod");
		System.out.println("Initial list:" + ll);
		
		// remove from list
		ll.remove("Amod");
		System.out.println("After removing an element:"+ll);
		
		LinkedList <String> ll2 = new LinkedList<String>();
		ll2.add("Hemantbhai");
		ll2.add("Ketanbhai");
		ll2.add("Suhasbhai");
		System.out.println("Another list:"+ll2);
		
		// add items from another list
		ll.addAll(ll2);
		System.out.println("After adding other list:"+ll);
		
	
	}

}
