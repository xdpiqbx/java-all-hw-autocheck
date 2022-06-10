package module_007.Task_004;

import java.util.Arrays;

class PhraseTest {
    public static void main(String[] args) {
        String[] words = {"alpha", "beta", "gamma"};

        Phrase phrase = new Phrase(words);

        //alpha beta gamma
        System.out.println(phrase);

        words[0] = "zero";

        //alpha beta gamma
        System.out.println(phrase);
    }
}

class Phrase{
    private String[] words;
    public Phrase(String[] words) {
        this.words = Arrays.copyOf(words, words.length);
    }

    @Override
    public String toString() {
        StringBuilder temp = new StringBuilder();
        for (String word: this.words) {
            temp.append(word).append(" ");
        }
        return temp.toString().trim();
    }
}