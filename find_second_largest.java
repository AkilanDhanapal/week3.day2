package week3.day3;


import java.util.*;
import java.util.Collections;

public class find_second_largest {

		public static void main(String[] args) {
			int[] arr = { 3, 2, 11, 4, 6, 7 };
			int result = 0;
			List<Integer> l1 = new ArrayList<Integer>();
			for (int i : arr) {
				l1.add(i);
			}
			Collections.sort(l1);
			result = l1.get(l1.size() - 2);
			System.out.println("The elements in ascending order " + l1);
			System.out.println("The second largest element is  " + result);

		}
}
