package lab4subj;

public class Driver {
	
	public static void main(String[] args) {
	
		Subject [] subjectArray = new Subject[5];
		
		Maths m1 = new Maths();
		m1.setTutor("D.Trump");
		//m1.setRoom("The white house");
		
		try {
			System.out.println(m1.getRoom());
		} catch (NoRoomException e) {
			System.out.println(e);
			
		}
		
		subjectArray[0] = m1;
		
		Art a1 = new Art();
		a1.setTutor("Salvador Dali");
		a1.setRoom("Figueres");
		subjectArray[1] = a1;
	}

}
