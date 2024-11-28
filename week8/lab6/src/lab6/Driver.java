package lab6;

public class Driver {
	
	public static void main(String[] args) {
		
		EmailStore store = new EmailStore();
	
		store.addEmail("Josh@outlock.com");
		store.addEmail("gdgh@outlock.com");
		store.addEmail("rgbndrigfbd@outlock.com");
		store.addEmail("jhgifoh@Zmail.com");
		store.displayEmails();
		
		System.out.println(store.addEmail("Josh@outlock.com"));
		
		
	}
	
}
