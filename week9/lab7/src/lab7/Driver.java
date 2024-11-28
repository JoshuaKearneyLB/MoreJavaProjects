package lab7;

public class Driver {

	public static void main(String[] args) {
		
		Census census = new Census();
		
		Person person1 = new Person(191.3, 23, true);
		census.addPerson(person1);
		
		Person person2 = new Person(171.3, 21, false);
		census.addPerson(person2);
		
		Person person3 = new Person(168.7, 19, false);
		census.addPerson(person3);
		
		Person person4 = new Person(151.4, 23, true);
		census.addPerson(person4);
		
		
		System.out.println(census.toString());
		
		census.sortOnAge();
		
		System.out.println(census.toString());
	}

	
	
}
