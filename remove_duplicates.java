package week3.day3;

import java.util.LinkedHashSet;
import java.util.Set;

public class remove_duplicates {
	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		System.out.println("With duplicates - " +text);
		String[] s = text.split(" ");
		Set<String> obj_set = new LinkedHashSet<String>();
		for (String string : s) {
			obj_set.add(string);
		}
		System.out.println("Without duplicates - " +obj_set);
	}

}
