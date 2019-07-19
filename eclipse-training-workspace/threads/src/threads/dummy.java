package threads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class dummy {

	public static void main(String[] args) {
	
		List <String> items = new  ArrayList();
		items.add("We");
		items.add("are");
		List<String> items2 = new ArrayList();
		items2.add("The");
		items2.add("Boys");
		items2.add("the");
		items2.add("We");
		items2.add("are");
		items2.add("We");
		items2.add("are");
		System.out.println(items);
		System.out.println(items2);
		items2.removeAll(items);
		System.out.println(items);
		System.out.println(items2);
		
		
		
		List<Integer> list1 = Arrays.asList(1,2,3);
		List<Integer> list2 = Arrays.asList(1,2,3,4,5,1,2,3);
		
				
		List<Integer> diff = list2.stream()
								.filter(e -> !list1.contains(e))
								.collect(Collectors.toList());
		
		System.out.println("**********");
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(diff);
		System.out.println("**********");
	}

}
