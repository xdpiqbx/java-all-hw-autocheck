package module_007.Task_007;

import java.util.Arrays;

class DoubleSpaceCleanerTest {
    public static void main(String[] args) {
        DoubleSpaceCleaner cleaner = new DoubleSpaceCleaner();

        //Hello World
        System.out.println(cleaner.clean("Hello World"));

        //Hello World
        System.out.println(cleaner.clean("       Hello              World          "));
    }
}

class DoubleSpaceCleaner{
    public String clean(String phrase){
        String []words = phrase.split("\\s+");
        StringBuilder trimmedPhrase = new StringBuilder();
        for (String word : words) {
            trimmedPhrase.append(word.trim()).append(" ");
        }
        return trimmedPhrase.toString().trim();
    }
}