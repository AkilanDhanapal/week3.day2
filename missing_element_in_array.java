package week3.day3;

import java.util.*;

public class missing_element_in_array {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,7,6,8};
		List<Integer> l1 = new ArrayList<Integer>();
		for (int i:a)
		{
			l1.add(i);
		}
		System.out.println("Given numbers - " + l1);
		Collections.sort(l1);
		System.out.println("Sorted numbers - " + l1);
		int i=1;
		for(Integer value:l1)
		{
			if(value !=i)
			{
			System.out.println("Missing Elements is: " + i);
			break;
			}
			i++;
		}
		
	}

}
