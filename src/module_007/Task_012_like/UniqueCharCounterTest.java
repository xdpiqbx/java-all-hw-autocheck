package module_007.Task_012_like;

import java.util.Arrays;

class UniqueCharCounterTest {
    public static void main(String[] args) {
        UniqueCharCounter charCounter = new UniqueCharCounter();

        //3
        System.out.println(charCounter.count("123"));

        //4
        System.out.println(charCounter.count("ab100"));

        //3
        System.out.println(charCounter.count("Java"));
    }
}

class UniqueCharCounter{
    public int count(String phrase){
        int [] intArray = convertPhraseToSortedIntArray(phrase);
        int arrLen = intArray.length;
        int unicCount = arrLen;
        int currentNum = intArray[0];
        for (int i = 1; i < arrLen; i++) {
            if(currentNum == intArray[i]){
                unicCount--;
                continue;
            }
            currentNum = intArray[i];
        }
        return unicCount;
    }
    private int[] convertPhraseToSortedIntArray(String phrase){
        char [] letters = phrase.toCharArray();
        int arrLen = letters.length;
        int [] intArr = new int [letters.length];
        for (int i = 0; i < arrLen; i++) {
            intArr[i] = letters[i];
        }
        Arrays.sort(intArr);
        return intArr;
    }
}
