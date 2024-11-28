package lab7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Census {
	
	private List<Person> people = new ArrayList<Person>();
	
	
	public void addPerson(Person person) {
		people.add(person);
	}
	
	
	public boolean removePerson(Person person) {
		if(people.contains(person)) {
			people.remove(person);
			return true;
		}
		else {
			return false;
		}
	}
	
	
	public int countPeople() {
		return people.size();
	}
	
	
	public int countMales() {
		int count = 0;
		for(Person item : people) {
			if(item.getGender() == true) { //Where male = true
				count+=1;
			}
		}
		return count;
	}
	
	
	public int countFemales() {
		return (countPeople() - countMales()); //total - males = females
	}
	
	
	public sortOnAge() {
		
		Collections.sort(people, new Comparator<Person>() {
			
			@Override 
			public int compare(Person p1, Person p2) {
				
				
			}
			
		}
		);
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public String toString() {
		
		String AllPeople = "";
		
		for (Person item : people) {
			AllPeople += item.toString() + "\n";
		}
		return AllPeople;
	}
	
	
}
