public class Phrase {
	
	private String currentPhrase;
	
	public Phrase(String p) {
		this.currentPhrase = p;
	}
	
	public int findNthOccurence (String str, int n) {
		int num = -1;
		int count = 0;
		for(int i = 0; i<currentPhrase.length()- str.length(); i++) {
			if(currentPhrase.substring(i,i+str.length()).equals(str)) {
				count++;
				if(count == n) {
					num = i;
				}
			}
		}
		return num;
	}
	
	public void replaceNthOccurrence(String str, int n, String repl) {
		if(findNthOccurence(str, n) != -1) {
		String start = currentPhrase.substring(0, findNthOccurence(str,n)) ; 
		String end = currentPhrase.substring(start.length()+1, currentPhrase.length());
		currentPhrase = start + repl + end;
		}
	}
	
	public int findLastOccurrence(String str) {
		for(int i = currentPhrase.length() - str.length(); i >= 0; i--) {
			if(currentPhrase.substring(i,i+str.length()).equals(str));
			return i;}
		return -1;	
		}
	
	public String toString() {
		return currentPhrase;
	}
	
}

}
