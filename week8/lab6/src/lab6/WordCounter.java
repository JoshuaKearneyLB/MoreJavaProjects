package lab6;
import java.util.HashMap;
import java.util.Map;


public class WordCounter {
	private Map<String, Integer> wordMap = new HashMap<String, Integer>();
	
	public void addWord(String word) {
		
		if (wordMap.containsKey(word)){
			wordMap.replace(word, wordMap.get(word)+1);
		}
		else {
			wordMap.put(word, 1);
		}
	}
		

	public void addSentence(String sentence) {
		
		String[] wordArray = sentence.split(" ");
		
		for(String word : wordArray) {
			addWord(word);
		}
	}
	
	
	public void outputResults() {
		
		for(Map.Entry<String, Integer> entry : wordMap.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}	
	}
	
	
}
