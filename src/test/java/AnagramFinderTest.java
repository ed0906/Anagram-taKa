import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AnagramFinderTest {

	@Test
	public void anagramShouldBeSameLength() {
		String word = "ab";
		String anagram = "ab";

		assertTrue(Anagram.isAnagram(word, anagram));
	}

	@Test
	public void notAnagramIfDifferentLength() {
		String word = "a";
		String anagram = "aa";

		assertFalse(Anagram.isAnagram(word, anagram));
	}

	@Test
	public void oneLetterWordIsNotAnAnagramUnlessSameCharacter() {
		assertFalse(Anagram.isAnagram("a", "b"));
	}
	
	@Test
	public void twoLetterWordsMatchingOneLetterNotAnagram() {
		String word = "ab";
		String anagram = "ac";

		assertFalse(Anagram.isAnagram(word, anagram));
	}

	@Test
	public void anagramsMustHaveSameLetters() {
		String word = "aba";
		String anagram = "bba";

		assertFalse(Anagram.isAnagram(word, anagram));
	}

	@Test
	public void shouldAllowParseAndSpare() {
		String word = "parse";
		String anagram = "spare";

		assertTrue(Anagram.isAnagram(word, anagram));
	}
}
