package module_007.Task_008;

class WordFreqCounterTest {
    public static void main(String[] args) {
        WordFreqCounter freqCounter = new WordFreqCounter();
        //0.5
        System.out.println(freqCounter.countFreq("Hello Java", "java"));
        //0
        System.out.println(freqCounter.countFreq("Hello World", "java"));
    }
}

class WordFreqCounter{
    public float countFreq(String phrase, String word){
        String [] words = phrase.split(" ");
        int wordCount = words.length;
        int count = 0;
        for (String wrd: words) {
            if(wrd.equalsIgnoreCase(word)){
                count++;
            }
        }
        float res = (float)count > 0f ? (float)count / (float)wordCount : 0f;
        return res;
    }
}