package anagram;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class WordListTest {

    @Test
    public void shouldReadWordList() {
        WordList wordList = new WordList();

        List<String> words = wordList.getWords();

        assertThat(words).isNotEmpty();
    }

}
