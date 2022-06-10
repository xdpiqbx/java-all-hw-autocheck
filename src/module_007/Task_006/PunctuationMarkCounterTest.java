package module_007.Task_006;

class PunctuationMarkCounterTest {
    public static void main(String[] args) {
        PunctuationMarkCounter counter = new PunctuationMarkCounter();
        //2
        System.out.println(counter.count("Hello, world!"));
        //1
        System.out.println(counter.count("This is Sparta!"));
        //1
        System.out.println(counter.count("End."));
    }
}

class PunctuationMarkCounter{
    public int count(String phrase){
        char [] marks = new char[]{'.', ',', '!', ':', ';'};
        char [] symbolsFromPhrase = phrase.toCharArray();
        int markCount = 0;
        for (char mark : marks) {
            for (char symbol: symbolsFromPhrase) {
                if(mark == symbol){
                    markCount++;
                }
            }
        }
        return markCount;
    }
}