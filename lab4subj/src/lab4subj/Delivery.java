package lab4subj;

public interface Delivery {
	
	public String getTutor() throws NoTutorException;
	
	public void setTutor(String tutor);
	
	public String getRoom() throws NoRoomException;
	
	public void setRoom(String room);
	
}
