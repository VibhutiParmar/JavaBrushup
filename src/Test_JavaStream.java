import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_JavaStream {

	// Count the number of names starting with letter "A"
	// @Test
	public void regular() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Amal");
		names.add("Mitul");
		names.add("Ajay");
		names.add("Amit");
		names.add("Vivek");
		names.add("Sujal");
		names.add("Aastha");
		names.add("Vibhuti");
		int count = 0;
		for (int i = 0; i < names.size(); i++) {
			String actual = names.get(i);
			if (actual.startsWith("A")) {
				count++;
			}
		}
		System.out.println(count);

	}

	// @Test
	public void streamFilter() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Amal");
		names.add("Mitul");
		names.add("Ajay");
		names.add("Amit");
		names.add("Vivek");
		names.add("Suja");
		names.add("Aastha");
		names.add("Vibhuti");

		/*
		 * Note: There is no filter to intermediate operation if there is no terminal
		 * operation Terminal operation will execute only if intermediate operation
		 * (filter) returns true We can create Stream how to use filter in Stream API
		 */

		// long c = names.stream().filter(s->s.startsWith("A")).count();
		// System.out.println(c);

		long d = Stream.of("Amul", "Mitul", "Amit", "Vibhuti", "Aarchi").filter(s -> {
			s.startsWith("A");
			return true;
		}).count();
		System.out.println(d);

		// print all names of ArrayList

		// names.stream().filter(v->v.length()>4).forEach(v->System.out.println(v));
		names.stream().filter(v -> v.length() > 4).limit(1).forEach(v -> System.out.println(v));
	}

//	@Test
	public void streamMap() {

		// print name which have last letter "i" with uppercase

		// Stream.of("Amul", "Mitul", "Amit", "Vibhuti", "Aarchi").filter(s ->
		// s.endsWith("i")).map(v -> v.toUpperCase())
		// .forEach(v -> System.out.println(v));

		// print name which has first latter is "a" and upper case and sorted

		Stream.of("Amul", "Mitul", "Amit", "Vibhuti", "Aarchi").filter(s -> s.startsWith("A")).sorted()
				.map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));

		// Mergind 2 arrays

		List<String> a1 = Arrays.asList("Vibhuti", "Vivek");
		List<String> a2 = Arrays.asList("Parmar");

		Stream<String> a3 = Stream.concat(a1.stream(), a2.stream());
		// a3.forEach(s->System.out.println(s));

		// add validation
		// boolean flag = a1.stream().anyMatch(s->s.equalsIgnoreCase("Vibhuti"));
		boolean flag = a3.anyMatch(s -> s.equalsIgnoreCase("Vibhuti"));
		System.out.println(flag);
		Assert.assertTrue(flag);

	}

	@Test
	public void streamCollect(){
		//List
		//New List
		List<String> ls = Stream.of("Amul", "Mitul", "Amit", "Vibhuti", "Aarchi").filter(s->s.startsWith("A")).sorted()
		.map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(ls.get(0));
		
		List<Integer> values = Arrays.asList(2,4,3,2,5,6,4,8,9,1);
		values.stream().distinct().forEach(s->System.out.println(s));
		long a = values.stream().distinct().count();
		System.out.println("a: "+a);
		List<Integer> li = values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(li.get(2));
		
	}

}
