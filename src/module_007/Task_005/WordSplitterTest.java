package module_007.Task_005;

import java.util.Arrays;
import java.util.Locale;

class WordSplitterTest {
    public static void main(String[] args) {
        WordSplitter wordSplitter = new WordSplitter();

        String[] words = wordSplitter.split("Hello      world");

        //[hello, world]
        System.out.println(Arrays.toString(words));
    }
}

class WordSplitter{
    public String[] split(String phrase){
        String [] rawWords = phrase.split("\\s+");
        int wordsCount = 0;
        for (String word: rawWords) {
            if (word.length() != 0){
                rawWords[wordsCount] = word.toLowerCase();
                wordsCount++;
            }
        }
        return Arrays.copyOf(rawWords, rawWords.length);
    }
}