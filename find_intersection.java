package week3.day3;

import java.util.HashSet;
import java.util.Set;

public class find_intersection {
	public static void main(String[] args) {
		int a1[] = {3,2,11,4,6,7};
		int a2[] = {1,2,8,4,9,7};
		
		
		Set<Integer> s1 = new HashSet<Integer>();
		Set<Integer> s2 = new HashSet<Integer>();
		
		for(int i: a1)
		{
			s1.add(i);
		}
		for(int j: a2)
		{
			s2.add(j);
		}
		System.out.println("Intersection is");
		for (Integer k:s1)
		{
			if(s2.contains(k))
				System.out.println(k);
		}
	}

}
