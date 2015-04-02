
public class Anagram {

	public static boolean isAnagram(String word, String anagram) {
		if (word.isEmpty() && anagram.isEmpty()) {
			return true;
		}
		return word.length() == anagram.length()
				&& anagram.contains(word.substring(0, 1))
				&& isAnagram(word.substring(1), anagram.replaceFirst(word.substring(0, 1), ""));

	}

}
