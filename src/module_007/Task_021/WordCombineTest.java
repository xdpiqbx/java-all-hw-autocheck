package module_007.Task_021;

import java.util.Arrays;

class WordCombineTest {
    public static void main(String[] args) {
        //true
        System.out.println(new WordCombine().canCombine("Forest", "tor"));

        //true
        System.out.println(new WordCombine().canCombine("Magic", "Mama"));

        //false
        System.out.println(new WordCombine().canCombine("War", "Piece"));
    }
}

class WordCombine{
    public boolean canCombine(String sourceWord, String targetWord){
        char[] sourceWordArr = sourceWord.toLowerCase().toCharArray();
        char[] targetWordArr = targetWord.toLowerCase().toCharArray();
        int concurrenceCount = 0;
        for (char targetLetter: targetWordArr) {
            for (char sourceLetter: sourceWordArr) {
                if(sourceLetter == targetLetter){
                    concurrenceCount++;
                    break;
                }
            }
        }
        return concurrenceCount == targetWordArr.length;
    }
}