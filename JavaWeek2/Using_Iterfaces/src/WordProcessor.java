
public class WordProcessor implements Counter{
	
	String text;
	
	public String getText() {
		return this.text;
	}
	
	public void setText(String text) {
		this.text = text;
	}
	
	
	public int countWords() {
		int count = this.text.split(" ").length;
		return count;
	}
	
	
	public int countLetters() {
		
		int letters = 0;
		
		for (int i = 0; i < this.text.length();i++) {
			if (Character.isLetter(this.text.charAt(i))){
				letters++;
			}
		}	
		return letters;
	}
	
	
	public int getLength() {
		return this.text.length();
	}
	
	
	@Override
	public int countWords(String sentence) {
		int count = sentence.split(" ").length;
		return count;
	}

	@Override
	public int countLetters(String sentence) {
		
		int letters = 0;
		
		for (int i = 0; i < sentence.length();i++) {
			if (Character.isLetter(sentence.charAt(i))){
				letters++;
			}
		}	
		return letters;
	}
	

	@Override
	public int getLength(String sentence) {
		return sentence.length();
	}
	
	
	
	
	
	
	
}
