package lab7;

public class Person {
	double height;
	int age;
	boolean gender;
	
	public Person(double height, int age,boolean gender){
		this.height = height;
		this.age = age;
		this.gender = gender; //man is true and woman is false
	}
	
	public double getHeight(){
		return this.height;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public boolean getGender() {
		return gender;
	}
	
	public void setHeight(double height){
		this.height = height;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
	public String toString() {
		return("height: " + height + " age: " + age + " Gender: " + (gender ? "Male" : "Female"));
		
	}
	
}
