package module_007.Task_014;

class SensitiveDataSearcherTest {
    public static void main(String[] args) {
        SensitiveDataSearcher searcher = new SensitiveDataSearcher();

        //false
        System.out.println(searcher.isSensitiveDataPresent("Hello world"));

        //true
        System.out.println(searcher.isSensitiveDataPresent("Pass: swordfish"));
    }
}

class SensitiveDataSearcher{
    public boolean isSensitiveDataPresent(String phrase){
        phrase = phrase.toLowerCase();
        String [] sensitiveLib = new String []{"pass", "key", "login", "email"};
        for (String word: sensitiveLib) {
            if(phrase.contains(word)){
                return true;
            }
        }
        return false;
    }
}