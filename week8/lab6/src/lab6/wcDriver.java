package lab6;

public class wcDriver {
	
	public static void main(String[] args) {
		
		WordCounter wc = new WordCounter();
		wc.addSentence("word This sentence has the word has in thrice has now");
		wc.outputResults();
	}
	
}
