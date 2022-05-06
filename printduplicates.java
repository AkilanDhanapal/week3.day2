package week3.day3;


import java.util.*;

public class printduplicates {
	public static void main(String[] args) {
        int[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };
		List<Integer> l1 = new ArrayList<Integer>();
		for (int i : arr) {
			l1.add(i);
		}
		System.out.println("The numbers are " +l1);
		

		Set<Integer> Set1 = new HashSet<Integer>();
		System.out.println("The duplicate numbers are ");
		for(int i : arr){
			if(!Set1.add(i)){
				System.out.println(i);
			}
		}
	}

}
