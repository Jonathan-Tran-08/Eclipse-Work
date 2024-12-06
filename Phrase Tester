
public class PhraseTester {

	public static void main(String[] args) {
		Phrase phrase1 = new Phrase("A cat ate late.");
		Phrase phrase2 = new Phrase("a cat ate late.");
		Phrase phrase3 = new Phrase("A cat ate late.");
		Phrase phrase4 = new Phrase("aaaa");
		Phrase phrase5 = new Phrase("aaaa");

		System.out.println(phrase1.findNthOccurence("at", 1));
		System.out.println(phrase2.findNthOccurence("at", 6));
		System.out.println(phrase3.findNthOccurence("bat", 2));
		System.out.println(phrase4.findNthOccurence("aa", 1));
		System.out.println(phrase5.findNthOccurence("aa", 2));
		phrase1.replaceNthOccurrence("at",  1, "rane");
		System.out.println(phrase1);
		
		/*phrase2.replaceNthOccurrence("at", 6, "xx");
		System.out.println(phrase2);
		
		phrase3.replaceNthOccurrence("bat", 2, "xx");
		System.out.println(phrase3);
		
		phrase4.replaceNthOccurrence("aa", 1, "xx");
		System.out.println(phrase4);
		
		phrase5.replaceNthOccurrence("aa", 2, "bbb");
		System.out.println(phrase5);*/
	}
}
