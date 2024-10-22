package lab4subj;

public abstract class Science extends Subject{

	public Science(String name, String description) {
		super(name, description);
	}
	
	public int getCredit() {
		return 100;
	}
	
}
