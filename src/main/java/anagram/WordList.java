package anagram;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class WordList {

    public List<String> getWords() {
        List<String> words = new ArrayList<String>();
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(WordList.class.getResourceAsStream("/wordlist.txt")));
            String line;
            while((line = reader.readLine()) != null) {
                words.add(line);
            }
            return words;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return words;
    }
}
