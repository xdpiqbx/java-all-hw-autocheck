package module_007.Task_013_like;

class WordDeleterTest {
    public static void main(String[] args) {
        WordDeleter wordDeleter = new WordDeleter();

        //Hello
        System.out.println(wordDeleter.remove("tyxixuy sydiesu coe lutoekj tyxixuy zyryzai", new String[] {"coe"}));

        //This Sparta
        System.out.println(wordDeleter.remove("This is Sparta", new String[] {"is"}));
    }
}

class WordDeleter{
    public String remove(String phrase, String[] words){
        String [] wordsFromPhrase = phrase.split(" ");
        int phraseArrLen = wordsFromPhrase.length;
        int wordsArrLen = words.length;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < phraseArrLen; i++) {
            for (int j = 0; j < wordsArrLen; j++) {
                if (wordsFromPhrase[i].equals(words[j])){
                    wordsFromPhrase[i] = " ";
                }
            }
            result.append(wordsFromPhrase[i]).append(" ");
        }
        return this.clean(result.toString());
    }

    public String clean(String phrase){
        String []words = phrase.split("\\s+");
        StringBuilder trimmedPhrase = new StringBuilder();
        for (String word : words) {
            trimmedPhrase.append(word.trim()).append(" ");
        }
        return trimmedPhrase.toString().trim();
    }
}