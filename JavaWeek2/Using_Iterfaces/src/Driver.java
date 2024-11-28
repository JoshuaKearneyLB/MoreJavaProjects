import java.util.Scanner;

public class Driver {
	public static void main(String args[]) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Input here: ");
		String input = scan.nextLine();
		
		WordProcessor wordproc  = new WordProcessor();
		
		System.out.println("Word count: " + wordproc.countWords(input));
		wordproc.setText(input);
		System.out.println("Word count: " + wordproc.countWords());
		
		scan.close();
	}
	
	
	
}
