package lab4subj;

import java.util.Optional;

public abstract class Subject implements Delivery{
	String name, description, tutor, room;
	
	
	public abstract int getCredit();
	
	public String getName() {
		return this.name;
	}
	
	
	public String getDescription() {
		return this.description;
	}
	
	
	public Subject(String name, String description) {
		name = this.name;
		description = this.description;
	}
	
	
	public void setTutor(String tutor) {
		this.tutor = tutor;
	}
	
	
	public void setRoom(String room) {
		this.room = room;
	}
	
	
	public String getTutor() throws NoTutorException {
		
		if(this.room == null) {
			throw new NoTutorException("Tutor name has not been set.");
		}
		else {
			return this.tutor;
		}	
	}
	
	
	public String getRoom() throws NoRoomException {
		
		if(this.room == null) {
			throw new NoRoomException("Room has not been set.");
		}
		else {
			return this.room;
		}	
	}

}
