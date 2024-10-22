package lab4subj;

public abstract class Social extends Subject{

	public Social(String name, String description) {
		super(name, description);
	}
	
	public int getCredit() {
		return 50;
	}
}
