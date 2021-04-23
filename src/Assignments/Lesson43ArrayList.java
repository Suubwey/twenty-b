package Assignments;

import java.util.*;

public class Lesson43ArrayList {
	public static void Question1() {
		List<String> alst = new ArrayList<String>();
	}
	
	public static void Question2() {
		// ArrayLists are restricted in that only objects can be stored in them.
	}

	public static void Question3() {
		// The main advantage in using an ArrayList instead of a normal array is that the ArrayList is dynamic (resizable).
	}

	public static void Question4() {
		// By creating an ArrayList with a type parameter, this ensures that only objects of that specific type can be put into the ArrayList.
	}

	public static List a = new ArrayList(Collections.nCopies(101, 0)); // Initialize array to 100 0s because if this isn't done then the code that writes to this address will run into an out of range error.
	public static List<Integer> b = new ArrayList<Integer>(Collections.nCopies(101, 0));

	public static void Question5() {
		int x = 19;
		a.set(5, x);
		b.set(5, x);
	}

	public static void Question6() {
		int gh = (int) a.get(22); // cast down from Object to int
		gh = b.get(22);
	}

	public static void Question7() {
		int sz = a.size();
		sz = b.size();
	}

	public static void Question8() {
		int kd = (int) a.get(101); // cast down from Object to int
		a.set(101, 17);
		kd = b.get(101);
		b.set(101, 17);
	}

	public static void Question9() {
		a.add(59, 127);
		b.add(59, 127);
	}

	public static void Question10() {
		List<Integer> alist = new ArrayList<Integer>();
		while (!alist.isEmpty()) {
			alist.removeLast();
		}
		// This while loop will remove the items in the list one by one, removing while there are still items in the list
	}

	public static void Question11() {
		List<Integer> alist = new ArrayList<Integer>();
		alist.clear(); // This also removes all items in the ArrayList. 
	}

	public static void Question12() {
		ArrayList<String> buster = new ArrayList<String>(); // <- First initializing the array so the program compiles.
		String myString = buster.get(99); // This is the single line of code that does the job.
	}

	public static void Question13() {
		// Without a type parameter, an Object type object is returned in retriving items from the ArrayList. With the type parameter the return type is the type specified in the type parameter.
	}

	public static void main(String[] args) {
		Question5();
	}


}
