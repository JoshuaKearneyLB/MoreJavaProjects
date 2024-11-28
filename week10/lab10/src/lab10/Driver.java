package lab10;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Driver {

	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<Student>();
		
		students.add(new Student(1, "JJ. Jognson", 38));
		students.add(new Student(2, "P. Tibbs", 48));
		students.add(new Student(3, "W. Major", 28));
		students.add(new Student(4, "P. Turner", 60));
		students.add(new Student(5, "A. Ball", 20));
		students.add(new Student(6, "B. Smithy", 90));
		students.add(new Student(7, "R. Jules", 71));
		students.add(new Student(8, "T. Verne", 97));

		
		// create your Stream solutions here
		//Data -> pipe -> operation and output to terminal
		
		//output all
		students.stream().forEach(System.out::println);
		
		//Grade over 70%
		System.out.println("=====Students scoring over 70========");
		students.stream().filter((s) -> s.getGrade() > 70).forEach(System.out::println);
		
		//mapping
		Object [] studentArray = students.stream().map(s -> s.getName()).sorted().toArray();
		System.out.print(Arrays.toString(studentArray));
		
		double aveGrade = students.stream().mapToDouble((s) -> s.getGrade()).average().getAsDouble();
		System.out.println("\n" + "Average grade: " +aveGrade);
		
		//Gen stream 1
		IntStream.range(90, 101).map(n -> (int)(n * n * n)).forEach(System.out::println);
		
		//Gen stream 2
		List<Integer> numlist = Stream.generate(Math::random).map(n -> (int)(n * 5 + 1)).limit(10).distinct().collect(Collectors.toList());
		for(int item : numlist) {
			System.out.println(item);
		}
		
		
		//
		
		
	
	}
}