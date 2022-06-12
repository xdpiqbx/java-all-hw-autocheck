package module_007.Task_018;

class AvgWordLengthTest {
    public static void main(String[] args) {
        //6
        System.out.println(new AvgWordLength().count("Launch Rocket"));

        //4.5
        System.out.println(new AvgWordLength().count("Life is strange thing"));
    }
}

class AvgWordLength{
    public double count(String phrase){
        String [] words = phrase.split(" ");
        int wordsCount = words.length;
        int totalLetters = 0;
        for (String word: words) {
            totalLetters += word.length();
        }
        return (double)totalLetters / (double)wordsCount;
    }
}