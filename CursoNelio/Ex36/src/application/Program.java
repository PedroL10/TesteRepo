package application;

import java.util.HashSet;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		
		set.add("Tv");
		set.add("Notebook");
		set.add("PlayStation 5");
		
		System.out.println(set.contains("PlayStation 5"));
		
		for(String p : set) {
			System.out.println(p);
		}

	}

}
